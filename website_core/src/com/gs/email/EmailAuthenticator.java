/**
 * Title: CigAuthenticator
 * Description: Authenticates w/mail server
 * Copyright:    Copyright (c) 2001
 * Company: OVS	
 * @author Mathias, Chris
 * @version 1.0
 */
package com.gs.email;


import javax.mail.*;


public class EmailAuthenticator extends Authenticator
{

	String m_sUserName;
	String m_sPassword;
	
	public EmailAuthenticator(String username, String password)
	{
		m_sUserName = username;
		m_sPassword = password;
	}

	//required because this method will be called by session object
	public PasswordAuthentication getPasswordAuthentication()
	{
		
		return new PasswordAuthentication(m_sUserName, m_sPassword);
	
	}

}
