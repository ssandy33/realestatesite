package com.gs.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class State {

	private int id;
	private String name;
	private String abbreviation;
	private int countryId;

	public State(){}
	
	public State(ResultSet rs) {
		
		try {
			this.setId(rs.getInt("id"));
			this.setName(rs.getString("name"));
			this.setAbbreviation(rs.getString("abbreviation"));
			this.setCountryId(rs.getInt("country_id"));
		} catch (SQLException e) {}
	}
	
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
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
}
