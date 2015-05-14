package com.gs.models;

import java.sql.Date;

public class AgentReferral {
	private int id;
	private int agentId;
	private int referralId;
	private String comments;
	private Date createdAt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public int getReferralId() {
		return referralId;
	}
	public void setReferralId(int referralId) {
		this.referralId = referralId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
