package com.gs.models;

import java.util.ArrayList;

public class Community {

	private int id;
	private String name;
	private String abbreviation;
	private ArrayList<FloorPlanDetail> floorPlanDetails;
	
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
	public ArrayList<FloorPlanDetail> getFloorPlanDetails() {
		return floorPlanDetails;
	}
	public void setFloorPlanDetails(ArrayList<FloorPlanDetail> floorPlanDetails) {
		this.floorPlanDetails = floorPlanDetails;
	}
	public boolean hasFloorPlanDetails() {
		return (floorPlanDetails.size() > 0);
	}
	
}
