package com.gs.pages;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import com.gs.database.AgentDAO;
import com.gs.database.EmailTemplateDAO;
import com.gs.email.EmailTemplates;
import com.gs.email.SendMail;
import com.gs.models.Agent;
import com.gs.models.EmailTemplate;
import com.gs.pages.base.SpecialHeaderPage;

public class ViewEmailPage extends SpecialHeaderPage {
	
	private String email;
	
	public ViewEmailPage(HttpServletRequest request) {
		super(request);
		String guid;
		Integer etp;
		
		guid = (String)request.getSession().getAttribute("guid");
		etp = (Integer)request.getSession().getAttribute("etp");
		
		pageSessionSingleton.setAgentReferralLink(request, true);
		
		loadEmailTemplate(guid, etp.intValue());
	}
	
	private void loadEmailTemplate(String guid, int emailTemplateId) {
		EmailTemplate emailTemplate = null;
		Agent agent = null;
		EmailTemplateDAO emailTemplateDAO = new EmailTemplateDAO();
		AgentDAO agentDAO = new AgentDAO();
		
		try
		{
			emailTemplate = emailTemplateDAO.getEmailTemplate(emailTemplateId);
			agent = agentDAO.loadByGuid(guid);
		}
		catch (Exception emailException)
		{
			emailException.toString();
		}
		
		switch (emailTemplateId) {
    	case EmailTemplates.FlatFeeforReferrals: fillInTheEmailBlanks(emailTemplate.getPageView(), agent, EmailTemplates.FlatFeeforReferrals);
    	break;
	}
		
	}
	
	private String fillInTheEmailBlanks(String template, Agent agent, int emailTemplate) {
		email = template.replace("<%FIRST_NAME%>", agent.getFirstName());
		email = email.replace("<%GUID%>", agent.getGuid());
		email = email.replace("<%ETP%>", String.valueOf(emailTemplate));
		
		return email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
