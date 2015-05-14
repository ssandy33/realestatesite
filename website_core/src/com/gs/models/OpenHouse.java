package com.gs.models;

import java.sql.Timestamp;

import com.gs.utils.GenUtils;

public class OpenHouse extends BaseModel {
	private int id;
	private int listingId;
	Timestamp startDate;
	Timestamp endDate;
	private int status;
	private String address;
	
	public OpenHouse(){}
	
	public OpenHouse(int listingId, Timestamp startDate, Timestamp endDate)
	{
		this.listingId = listingId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = 1;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getListingId() {
		return listingId;
	}
	public void setListingId(int listingId) {
		this.listingId = listingId;
	}
	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	public String getStartDateFormatted() {
		return GenUtils.formatDate("EEEE, MMMM d", this.startDate);
	}
	public String getStartTimeFormatted() {
		return GenUtils.formatDate("h:mm a", this.startDate);
	}
	public Timestamp getEndDate() {
		return endDate;
	}
	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}
	public String getEndTimeFormatted() {
		return GenUtils.formatDate("h:mm a", this.endDate);
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
