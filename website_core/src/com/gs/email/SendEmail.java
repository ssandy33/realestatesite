package com.gs.email;

import com.gs.database.EmailTemplateDAO;
import com.gs.models.Agent;
import com.gs.models.Contact;
import com.gs.models.EmailTemplate;
import com.gs.models.Listing;

public class SendEmail {
	
	private static SendEmail ref;
	
	private SendEmail() {}
	
	public static synchronized SendEmail getSendEmailSingleton() {
		if (ref == null)
			ref = new SendEmail();
		return ref;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	StringBuilder sEmailBodyHTML = new StringBuilder(16384);
	EmailTemplate emailTemplate = null;
	EmailTemplateDAO emailTemplateDAO = new EmailTemplateDAO();
	SendMail oEmail = null;
	
	public void sendEmail(int email, Agent agent) {
		switch (email) {
	    	case 1: sendAgentReferralResponse(agent);
	    	break;
		}
	}
	
	private void sendAgentReferralResponse(Agent agent) {
		try {
			emailTemplate = emailTemplateDAO.getEmailTemplate(EmailTemplates.FlatFeeforReferrals);

			oEmail = new SendMail();
			oEmail.setTo("referrals@realestateagentinarizona.com");
			oEmail.setFrom("referrals@realestateagentinarizona.com");
			oEmail.setSubject(emailTemplate.getSubject());
			oEmail.setBody(fillInTheEmailBlanks(emailTemplate.getHtml(),agent));
			oEmail.sendHTML();
		} catch (Exception e) {}
	}
	
	private static String fillInTheEmailBlanks(String email, Agent agent) {
		email = email.replace("<%FIRST_NAME%>", agent.getFirstName());
		email = email.replace("<%GUID%>", agent.getGuid());
		
		return email;
	}
	
	public boolean sendRequestListingShowingEmail(int email, Listing listing, Contact contact, String msg) {
		try {
			emailTemplate = emailTemplateDAO.getEmailTemplate(EmailTemplates.RequestListingShowing);
		
			oEmail = new SendMail();
			oEmail.setTo("gabbysandy@gmail.com");
			oEmail.setFrom("referrals@realestateagentinarizona.com");
			oEmail.setBcc("shawn.sandy@gmail.com");
			oEmail.setSubject(emailTemplate.getSubject());
			oEmail.setBody(fillInTheEmailBlanks(emailTemplate.getHtml(), listing, contact, msg));
			oEmail.sendHTML();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	private static String fillInTheEmailBlanks(String email, Listing listing, Contact contact, String msg) {
		
		email = email.replace("<%=MLSNUMBER%>", String.valueOf(listing.getListNumber()));
		email = email.replace("<%=NAME%>", contact.getFullName());
		email = email.replace("<%=EMAIL%>", contact.getEmail());
		email = email.replace("<%=PHONE%>", contact.getPhone());
		email = email.replace("<%=COMMENTS%>", msg);
		
		return email;
	}
}
