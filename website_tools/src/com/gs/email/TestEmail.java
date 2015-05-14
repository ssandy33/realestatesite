package com.gs.email;

import com.gs.database.EmailTemplateDAO;
import com.gs.models.EmailTemplate;


public class TestEmail {
	
	public static void main(String[] args) {
		
		StringBuilder sEmailBodyHTML = new StringBuilder(16384);
		EmailTemplate emailTemplate = null;
		EmailTemplateDAO emailTemplateDAO = new EmailTemplateDAO();
		SendMail oEmail = null;
		
		try
		{

//			sEmailBodyHTML.append("sup");
			emailTemplate = emailTemplateDAO.getEmailTemplate(EmailTemplates.FlatFeeforReferrals);
			oEmail = new SendMail();
//			oEmail.setHost(sEmailServer);
//			oEmail.setUserName("");
//			oEmail.setPassword("");
			oEmail.setTo("shawn.sandy@gmail.com"); 
//			oEmail.setTo("check@isnotspam.com");
//			oEmail.setTo("shawn.sandy@ourvacationstore.com");
			
			oEmail.setFrom(emailTemplate.getFromAddress());			
			oEmail.setSubject(emailTemplate.getSubject());			
			oEmail.setBody(fillInTheEmailBlanks(emailTemplate.getHtml()));
			oEmail.sendHTML();
			
		}
		catch (Exception emailException)
		{
			emailException.toString();
		}
	}
	
	private static String fillInTheEmailBlanks(String email) {
		return email;
	}
	
	private static String getEmailBody() {
		StringBuilder sEmailBodyHTML = new StringBuilder(16384);
		
		sEmailBodyHTML.append("<HTML>");
		sEmailBodyHTML.append("<table border='0' cellpadding='0' cellspacing='0' width='620'>");
				sEmailBodyHTML.append("<tr>");
					sEmailBodyHTML.append("<td style='font-family: Verdana, sans-serif; font-size: 12px;'>");
						sEmailBodyHTML.append("Dear Owner Rewards Customer,<br />");
						sEmailBodyHTML.append("&nbsp;<br />");
						sEmailBodyHTML.append("All usernames and passwords for this account are listed below. Please find your password below. You may change it on your Owner Rewards Account page.<br />");
						sEmailBodyHTML.append("&nbsp;<br />");
						sEmailBodyHTML.append("<span style='color: #777;'><strong>Customer ID:</strong></span> <%= @member.member_id %><br />");
						sEmailBodyHTML.append("<span style='color: #777;'><strong>Activation Date:</strong></span> <%= @member.enrollment_date %><br />");
						sEmailBodyHTML.append("&nbsp;<br />");
								sEmailBodyHTML.append("<h3 style='font-family: Verdana, sans-serif; font-size: 13px; margin: 0px; padding: 0px;'>Users with Access to Website</h4>");
				
		sEmailBodyHTML.append("<table cellpadding='2' cellspacing='0' width='100%' border='0' style='border-bottom: 3px solid #777;'>");
				sEmailBodyHTML.append("<tr>");
					sEmailBodyHTML.append("<td align='center' style='font-family: Verdana; font-size: 12px; background-color: #777; color: #fff; padding: 3px; font-weight: bold;'>Name</td>");
					sEmailBodyHTML.append("<td align='center' style='font-family: Verdana; font-size: 12px; background-color: #777; color: #fff; padding: 3px; font-weight: bold;'>E-mail Address</td>");
					sEmailBodyHTML.append("<td align='center' style='font-family: Verdana; font-size: 12px; background-color: #777; color: #fff; padding: 3px; font-weight: bold;'>User Name</td>");
					sEmailBodyHTML.append("<td align='center' style='font-family: Verdana; font-size: 12px; background-color: #777; color: #fff; padding: 3px; font-weight: bold;'>Password</td>");
				sEmailBodyHTML.append("</tr>");
				sEmailBodyHTML.append("<% @member.names.each_with_index do |name, i| %>");

				sEmailBodyHTML.append("<tr>");
					sEmailBodyHTML.append("<td width='30%' align='center' style='font-family: Verdana; font-size: 12px; color: #000000;'><%= name.full_name %></td>");
					sEmailBodyHTML.append("<td width='30%' align='center' style='font-family: Verdana; font-size: 12px; color: #000000;'><%= name.email %></td>");
					sEmailBodyHTML.append("<td width='20%' align='center' style='font-family: Verdana; font-size: 12px; color: #000000;'><%= name.user_name %></td>");
					sEmailBodyHTML.append("<td width='20%' align='center' style='font-family: Verdana; font-size: 12px; color: #000000;'><%= name.password %></td>");
				sEmailBodyHTML.append("</tr>");
				sEmailBodyHTML.append("<% end %>");
		sEmailBodyHTML.append("</table>");
		sEmailBodyHTML.append("&nbsp;<br />");
		sEmailBodyHTML.append("Sincerely,<br />");
		sEmailBodyHTML.append("Owner Rewards Customer Service<br />");
		sEmailBodyHTML.append("</td>");
		sEmailBodyHTML.append("</tr>");
		sEmailBodyHTML.append("</table>");
		sEmailBodyHTML.append("</HTML>");
		
		return sEmailBodyHTML.toString();
	}
	
}
