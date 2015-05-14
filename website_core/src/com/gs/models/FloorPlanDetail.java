package com.gs.models;

public class FloorPlanDetail {
	private int id;
	private String name;
	private String image;
	private int communityId;
	private String communityName;
	private String communityAbbreviation;
	private String squareFeet;
	private int bedRooms;
	private float bathRooms;
	private Community community;
	
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getCommunityId() {
		return communityId;
	}
	public void setCommunityId(int communityId) {
		this.communityId = communityId;
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
	public String getCommunityAbbreviation() {
		return communityAbbreviation;
	}
	public void setCommunityAbbreviation(String communityAbbreviation) {
		this.communityAbbreviation = communityAbbreviation;
	}
	public void setCommunity(Community community) {
		this.community = community;
	}
	public Community getCommunity() {
		return this.community;
	}
}
