package com.gs.models;

import java.sql.Date;
import java.sql.Time;

public class CampaignHit {

	private int id;
	private int campaignId;
	private int contactId;
	private int agentId;
	private Date createdAt;
	private Time time;
	
	public CampaignHit(){}
	
	public CampaignHit(int campaignId, int contactId, int agentId, Date createdAt, Time time) {
		this.campaignId = campaignId;
		this.contactId = contactId;
		this.agentId = agentId;
		this.createdAt = createdAt;
		this.time = time;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
