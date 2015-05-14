package com.gs.models;


import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.gs.utils.GenUtils;

public class OpenHouse extends BaseModel {
	private int id;
	private int listingId;
	private Timestamp startDate;
	private Timestamp endDate;
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
	
	public OpenHouse(int listingId, String startDate, String endDate)
	{
		this.listingId = listingId;
		this.startDate = getTimeStampFromString(startDate);
		this.endDate = getTimeStampFromString(endDate);
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
	public Timestamp getOpenHouseEndDate() {
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
	public Timestamp getTimeStampFromString(String s) {
		java.sql.Timestamp ts = null;
		DateFormat formatter = new SimpleDateFormat("dd-M-yyyy HH:mm:ss");
		Date date;
		try {
			date = formatter.parse(s);
			ts = new java.sql.Timestamp(date.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return ts;
	}
}
