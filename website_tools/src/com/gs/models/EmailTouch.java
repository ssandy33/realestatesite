package com.gs.models;

import java.sql.Date;

public class EmailTouch {
	private int id;
	private int emailTemplateId;
	private int agentId;
	private Date emailSentAt;
	
	public EmailTouch(){}
	
	public EmailTouch(int agentId, int emailTemplateId) {
		this.emailTemplateId = emailTemplateId;
		this.agentId = agentId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmailTemplateId() {
		return emailTemplateId;
	}
	public void setEmailTemplateId(int emailTemplateId) {
		this.emailTemplateId = emailTemplateId;
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public Date getEmailSentAt() {
		return emailSentAt;
	}
	public void setEmailSentAt(Date emailSentAt) {
		this.emailSentAt = emailSentAt;
	}
}
