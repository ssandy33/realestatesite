package com.gs.email;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import com.gs.database.AgentDAO;
import com.gs.database.EmailTemplateDAO;
import com.gs.database.EmailTouchDAO;
import com.gs.models.Agent;
import com.gs.models.EmailTemplate;
import com.gs.models.EmailTouch;

public class SendAgentReferral {
	
	public static void main(String[] args) {
		
		StringBuilder sEmailBodyHTML = new StringBuilder(16384);
		EmailTemplate emailTemplate = null;
		EmailTemplateDAO emailTemplateDAO = new EmailTemplateDAO();
		AgentDAO agentDAO = new AgentDAO();
		Agent agent = null;
		SendMail oEmail = null;
		UUID uuid = null;
		Iterator<Agent> agentsIT = null;
		
		try
		{
			emailTemplate = emailTemplateDAO.getEmailTemplate(EmailTemplates.FlatFeeforReferrals);
			
			List agents = agentDAO.getAgentsWhoWantEmails();
			agentsIT = agents.iterator();
			
			while (agentsIT.hasNext()) {
				agent = agentsIT.next();
//				agent.setGuid(UUID.randomUUID().toString());
//				agentDAO.updateAgentGuid(agent);

				oEmail = new SendMail();
				oEmail.setTo(agent.getEmail());
//				oEmail.setTo("check@isnotspam.com");
				oEmail.setFrom(emailTemplate.getFromAddress());
				oEmail.setSubject(emailTemplate.getSubject());
				oEmail.setBody(fillInTheEmailBlanks(emailTemplate.getHtml(),agent,EmailTemplates.FlatFeeforReferrals));
				oEmail.sendHTML();
				
				updateEmailTouch(agent, EmailTemplates.FlatFeeforReferrals);
			}					
		}
		catch (Exception emailException)
		{
			emailException.toString();
		}
		
	}
	
	private static String fillInTheEmailBlanks(String email, Agent agent, int emailTemplate) {
		email = email.replace("<%FIRST_NAME%>", agent.getFirstName());
		email = email.replace("<%GUID%>", agent.getGuid());
		email = email.replace("<%ETP%>", String.valueOf(emailTemplate));
		
		return email;
	}
	
	private static void updateEmailTouch(Agent agent, int emailTemplate) {
		EmailTouchDAO emailTouchDAO = new EmailTouchDAO();
		EmailTouch emailTouch = new EmailTouch(agent.getId(), emailTemplate);
		
		emailTouchDAO.Add(emailTouch);
	}

}
