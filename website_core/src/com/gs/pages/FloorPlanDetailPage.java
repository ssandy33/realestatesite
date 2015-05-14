package com.gs.pages;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gs.database.FloorPlanDetailDAO;
import com.gs.models.FloorPlanDetail;
import com.gs.pages.base.ContentPage;
import com.gs.utils.WebUtils;

public class FloorPlanDetailPage extends ContentPage {
	private String communityName;
	private String communityAbbreviation;
	private String squareFeet;
	private String name;
	private String imageName;
	private int bedRooms;
	private float bathRooms;
	
	public FloorPlanDetailPage(HttpServletRequest request) throws Exception {
		super(request);
		loadFloorPlan(request);
	}
	
	private void loadFloorPlan(HttpServletRequest request) {
		int fpid;
		FloorPlanDetail floorPlanDetail;
		
		floorPlanDetail = (FloorPlanDetail)request.getSession().getAttribute("floorplan");
		
		if (floorPlanDetail != null) {
			setCommunityName(floorPlanDetail.getCommunityName());
			setSquareFeet(floorPlanDetail.getSquareFeet());
			setName(floorPlanDetail.getName());
			setBedRooms(floorPlanDetail.getBedRooms());
			setBathRooms(floorPlanDetail.getBathRooms());
			setCommunityAbbreviation(floorPlanDetail.getCommunityAbbreviation());
			setImageName(floorPlanDetail.getImage());
		}
	}
	
	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public void setCommunityAbbreviation(String communityAbbreviation) {
		this.communityAbbreviation = communityAbbreviation;
	}

	public String getCommunityAbbreviation() {
		return communityAbbreviation;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getSquareFeet() {
		return squareFeet;
	}

	public void setSquareFeet(String squareFeet) {
		this.squareFeet = squareFeet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBedRooms() {
		return bedRooms;
	}

	public void setBedRooms(int bedRooms) {
		this.bedRooms = bedRooms;
	}

	public float getBathRooms() {
		return bathRooms;
	}

	public void setBathRooms(float bathRooms) {
		this.bathRooms = bathRooms;
	}
}
