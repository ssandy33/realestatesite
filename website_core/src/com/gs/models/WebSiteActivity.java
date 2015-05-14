package com.gs.models;

import java.util.Date;
import java.sql.Timestamp;

public class WebSiteActivity extends BaseModel {

	private int id;
	private Timestamp visitedAt;
	private int zillowReferer;
	private int truliaReferer;
	
	private WebSiteActivity(){}
	
	public WebSiteActivity(Timestamp visitedAt, int zillowReferer, int truliaReferer) {
		super();
		this.visitedAt = visitedAt;
		this.zillowReferer = zillowReferer;
		this.truliaReferer = truliaReferer;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getVisitedAt() {
		return visitedAt;
	}
	public void setVisitedAt(Timestamp visitedAt) {
		this.visitedAt = visitedAt;
	}
	public int getZillowReferer() {
		return zillowReferer;
	}
	public void setZillowReferer(int zillowReferer) {
		this.zillowReferer = zillowReferer;
	}

	public int getTruliaReferer() {
		return truliaReferer;
	}

	public void setTruliaReferer(int truliaReferer) {
		this.truliaReferer = truliaReferer;
	}
	
}
