package com.gs.email;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import com.gs.database.ContactDAO;
import com.gs.database.EmailTemplateDAO;
import com.gs.database.EmailTouchDAO;
import com.gs.models.Contact;
import com.gs.models.EmailTemplate;
import com.gs.models.EmailTouch;

public class SendOpenHouse {
	
	public static void main(String[] args) {
		
		StringBuilder sEmailBodyHTML = new StringBuilder(16384);
		EmailTemplate emailTemplate = null;
		EmailTemplateDAO emailTemplateDAO = new EmailTemplateDAO();
		ContactDAO contactDAO = new ContactDAO();
		Contact contact = null;
		SendMail oEmail = null;
		UUID uuid = null;
		Iterator<Contact> contactsIT = null;
		
		try
		{
			emailTemplate = emailTemplateDAO.getEmailTemplate(EmailTemplates.OpenHouseEmail5016548);
			
			List contacts = contactDAO.getContactsWhoWantEmails();
			contactsIT = contacts.iterator();
			
			while (contactsIT.hasNext()) {
				contact = contactsIT.next();
//				contact.setGuid(UUID.randomUUID().toString());
//				contactDAO.updateContactGuid(contact);
				if (contact.getEmail() != null && contact.getEmail().contains("@")) {
					oEmail = new SendMail();
					oEmail.setTo(contact.getEmail());
	//				oEmail.setTo("check@isnotspam.com");
					oEmail.setFrom(emailTemplate.getFromAddress());
					oEmail.setSubject(emailTemplate.getSubject());
					oEmail.setBody(fillInTheEmailBlanks(emailTemplate.getHtml(),contact,EmailTemplates.OpenHouseEmail5016548));
					oEmail.sendHTML();
					
					updateEmailTouch(contact, EmailTemplates.OpenHouseEmail5016548);
				}
			}					
		}
		catch (Exception emailException)
		{
			emailException.toString();
		}
		
	}

	
	private static String fillInTheEmailBlanks(String email, Contact contact, int emailTemplate) {
		email = email.replace("<%GUID%>", contact.getGuid());
		email = email.replace("<%ETP%>", String.valueOf(emailTemplate));
		
		return email;
	}
	
	private static void updateEmailTouch(Contact contact, int emailTemplate) {
		EmailTouchDAO emailTouchDAO = new EmailTouchDAO();
		EmailTouch emailTouch = new EmailTouch(contact.getId(), emailTemplate);
		
		emailTouchDAO.Add(emailTouch);
	}
}
