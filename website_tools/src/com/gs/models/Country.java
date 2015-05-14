package com.gs.models;

public class Country {

	private int id;
	private String name;
	private String abbreviation;
	private boolean hasStateList;
	
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
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public boolean isHasStateList() {
		return hasStateList;
	}
	public void setHasStateList(boolean hasStateList) {
		this.hasStateList = hasStateList;
	}
	
	
}
