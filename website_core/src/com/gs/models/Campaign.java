package com.gs.models;

public class Campaign {
	
	private int id;
	private String name;
	private int emailTemplateId;
	private int contactAgentBoth;
	private boolean isTweet;
	private int redirectUrlId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmailTemplateId() {
		return emailTemplateId;
	}
	public void setEmailTemplateId(int emailTemplateId) {
		this.emailTemplateId = emailTemplateId;
	}
	public int getContactAgentBoth() {
		return contactAgentBoth;
	}
	public void setContactAgentBoth(int contactAgentBoth) {
		this.contactAgentBoth = contactAgentBoth;
	}
	public boolean isTweet() {
		return isTweet;
	}
	public void setTweet(boolean isTweet) {
		this.isTweet = isTweet;
	}
	public int getRedirectUrlId() {
		return redirectUrlId;
	}
	public void setRedirectUrlId(int redirectUrlId) {
		this.redirectUrlId = redirectUrlId;
	}
	
}
