package com.gs.models;

public class EmailTemplate {
	private int id;
	private String html;
	private String subject;
	private String fromAddress;
	private String pageView;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHtml() {
		return html;
	}
	public void setHtml(String html) {
		this.html = html;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getFromAddress() {
		return fromAddress;
	}
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	public String getPageView() {
		return pageView;
	}
	public void setPageView(String pageView) {
		this.pageView = pageView;
	}

}
