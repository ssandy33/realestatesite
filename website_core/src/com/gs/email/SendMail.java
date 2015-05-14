package com.gs.email;

import java.io.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;


public class SendMail
{
	private boolean m_bHasAttachment = false;

	int m_iPort = 26;
	private int m_nAttachmentCount = 0;
		
	private String m_sBody;
	private String m_sBcc = "";
	private String m_sCC = "";
	private String m_sFrom;
//	private String m_sHost = "mail.gabbysandy.4java.ca";
	private String m_sHost = "server201.clustermax.net";
	private String m_sPassword = "uI5a9S10ko";
	private String m_sSubject;
	private String m_sTo;
	private String m_sUserName = "gabbysan";
	
	private Vector m_Attachments = new Vector();
	
	private Session m_oSession;
	
	
	public String getBody()
	{
		return m_sBody;
	}

	public void setBody(String body)
	{
		m_sBody = body;
	}

	public String getCC()
	{
		return m_sCC;
	}

	public void setCC(String cc)
	{	
		m_sCC = fixAddress(cc);
	}
	
	public String getBcc() {
		return m_sBcc;
	}

	public void setBcc(String m_sBcc) {
		this.m_sBcc = m_sBcc;
	}

	public String getFrom()
	{
		return m_sFrom;
	}
	
	public void setFrom(String from)
	{
		m_sFrom = from;
	}
	
	public String getHost()
	{
		return m_sHost;
	}
	
	public void setHost(String host)
	{
		m_sHost = host;
	}

	public void setPassword(String password)
	{
		m_sPassword = password;
	}
	
	public int getPort()
	{
		return m_iPort;
	}

	public void setPort(int port)
	{
		m_iPort = port;
	}
	
	public String getSubject()
	{
		return m_sSubject;
	}
		
	public void setSubject(String subject)
	{
		m_sSubject = subject;
	}

	public String getTo()
	{
		return m_sTo;
	}

	public void setTo(String to)
	{
		m_sTo = fixAddress(to);
	}	
	
	public String getUserName()
	{
		return m_sUserName;
	}

	public void setUserName(String username)
	{
		m_sUserName = username;
	}
	

	public SendMail()
	{
		//empty constructor for Beans compliance.
	}
	
	public SendMail(String sToIn, String sFromIn, String sSubjectIn, String sBodyIn)
	{
		//Constructor for simple mail send.
		m_sTo = sToIn;
		m_sFrom = sFromIn;
		m_sSubject = sSubjectIn;
		m_sBody = sBodyIn;
	}
	
	public void addAttachment(String sFileNameIn) throws java.io.IOException
	{
		String sPath;
		String sFileName;
		
		
		sPath = sFileNameIn.substring(0,sFileNameIn.lastIndexOf("\\"));
		sFileName = sFileNameIn.substring(sFileNameIn.lastIndexOf("\\")+1, sFileNameIn.length());
		
		if (fileExists(sPath,sFileName))
		{
			//add attachment to vector
			m_Attachments.add(sFileNameIn);
			
			m_bHasAttachment = true;			
		}
		else
		{
			throw new java.io.IOException("File to attach does not exist: " + sFileName);
		}
	}
	
	public void send() throws Exception
	{
		MimeBodyPart oBodyPart;
//		FileDataSource oFileDataSource;
		Multipart oMultipart;
		Transport transport;
		Message message;
	
		try
		{
			init();
			
			//construct message
			message = new MimeMessage(m_oSession);
			
			//can use InternetAddress.parse(string of comma separated address') for from/to/cc
			message.setFrom(new InternetAddress(m_sFrom));
			
			//set to
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(m_sTo));
		
			//set cc
			if (!m_sCC.equals(null) && !m_sCC.equals("")) message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(m_sCC));
			
			if (!m_sBcc.equals(null) && !m_sBcc.equals("")) message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(m_sBcc));
			
			//set content
			message.setSubject(m_sSubject);
			
			message.setSentDate(new java.util.Date());
			
			oMultipart = new MimeMultipart();
			oBodyPart = new MimeBodyPart();
			oBodyPart.setText(m_sBody);
			
			oMultipart.addBodyPart(oBodyPart);
			
//			//add attachments, if any
//			if (m_bHasAttachment)
//			{
//								
//				for (Enumeration e = m_Attachments.elements() ; e.hasMoreElements() ;)
//				{
//					oBodyPart = new MimeBodyPart();
//					oFileDataSource = new FileDataSource((String)e.nextElement());
//					oBodyPart.setDataHandler(new DataHandler(oFileDataSource));
//					oBodyPart.setFileName(oFileDataSource.getName());
//					oMultipart.addBodyPart(oBodyPart);					
//				}				
//			}
			
			//add parts to message
			message.setContent(oMultipart);
			
			message.saveChanges();
			
			//construct & connect transport
			transport = m_oSession.getTransport();
			
			transport.connect(m_sHost, m_iPort, m_sUserName, m_sPassword);
			
			//send message through transport
			transport.sendMessage(message, message.getAllRecipients());
			
			//close transport
			transport.close();
		}
		catch(Exception e)
		{
			throw new Exception("Exception occurred while attempting to send mail: " + e.toString());
		}
	}

	public void sendHTML() throws Exception
	{
		MimeBodyPart oHtmlBodyPart;
		MimeBodyPart oTextBodyPart;
//		FileDataSource oFileDataSource;
		Multipart oMultipart;
		Transport transport;
		Message message;
		String body ="<html><head></head><body><span>this is a test mail</span></body></html>";
	
		try
		{
			init();
			
			//construct message
			message = new MimeMessage(m_oSession);
			
			//can use InternetAddress.parse(string of comma separated address') for from/to/cc
			message.setFrom(new InternetAddress(m_sFrom));
			
			//set to
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(m_sTo));
		
			//set cc
			if (!m_sCC.equals(null) && !m_sCC.equals("")) message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(m_sCC));
			
			if (!m_sBcc.equals(null) && !m_sBcc.equals("")) message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(m_sBcc));
			
			//set content
			message.setSubject(m_sSubject);
			
			message.setSentDate(new java.util.Date());
			
			oMultipart = new MimeMultipart();
			
			oHtmlBodyPart = new MimeBodyPart();
			oTextBodyPart = new MimeBodyPart();
			
			oHtmlBodyPart.setContent(m_sBody, "text/html");
			oTextBodyPart.setContent(body.replaceAll("\\<[^>]*>","").replaceAll("&nbsp;","").replaceAll("&amp;","&"),"text/plain");
			
//			oMultipart.addBodyPart(oTextBodyPart);
			oMultipart.addBodyPart(oHtmlBodyPart);
			
			//add attachments, if any
//			if (m_bHasAttachment)
//			{
//								
//				for (Enumeration e = m_Attachments.elements() ; e.hasMoreElements() ;)
//				{
//					oBodyPart = new MimeBodyPart();
//					oFileDataSource = new FileDataSource((String)e.nextElement());
//					oBodyPart.setDataHandler(new DataHandler(oFileDataSource));
//					oBodyPart.setFileName(oFileDataSource.getName());
//					oMultipart.addBodyPart(oBodyPart);					
//				}				
//			}
			
			//add parts to message
			message.setContent(oMultipart);
			message.setHeader("Disposition-Notification-To", "referrals@realestateagentinarizona.com");
			
			message.saveChanges();
			
			//construct & connect transport
			transport = m_oSession.getTransport();
			
			transport.connect(m_sHost, m_iPort, m_sUserName, m_sPassword);
			
			//send message through transport
			transport.sendMessage(message, message.getAllRecipients());
			
			//close transport
			transport.close();
		}
		catch(Exception e)
		{
			throw new Exception("Exception occurred while attempting to send mail: " + e.toString());
		}
	}

	
	private Authenticator getAuthenticator()
	{
		return new EmailAuthenticator(m_sUserName, m_sPassword);	
	}	

	private String fixAddress(String sAddressIn)
	{
	
		// function just replaces alternate delimiters with ',' which InternetAddress.parse recognizes
		if (sAddressIn.indexOf(";") > 0)
		{
			return sAddressIn.replace(';', ',');
		}
		else
		{
			return sAddressIn;
		}
	
	}

	private void init()
	{
		java.util.Properties props = new java.util.Properties();	//System.getProperties();
		props.setProperty("mail.transport.protocol", "smtp");
		props.setProperty("mail.smtp.host", m_sHost);
		props.setProperty("mail.smtp.auth", "true");
		
		m_oSession = Session.getInstance(props, getAuthenticator());
	}
	
	private boolean fileExists(String sPathIn, String sFilenameIn)
	{
		File oRootFolder = new File(sPathIn);
			
		File[] oFilesInFolder;
		
		//holder for items in folder
		oFilesInFolder = oRootFolder.listFiles();
		
		//loop through, look for file...true if there, false if not.
		for(int i = 0; i < oFilesInFolder.length; i++)
		{	
			if (oFilesInFolder[i].getName().equals(sFilenameIn)) return true;
		}
				
		return false;
		
	}
	
}
