package com.gs.pages;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gs.models.Listing;
import com.gs.models.OpenHouse;
import com.gs.pages.base.ContentPage;

public class AdminPage extends ContentPage {
	
	private List<Listing> listings = null;
	private List<OpenHouse> openHouses = null;
	
	public AdminPage(HttpServletRequest request, HttpSession session) throws Exception {
		super(request);
		populateValues(session, request);
	}
	
	private void populateValues(HttpSession session, HttpServletRequest request) {
		listings = (List<Listing>)request.getAttribute("listings");
		openHouses = (List<OpenHouse>)request.getAttribute("openhouses");
	}
	
	public List<Listing> getListings() {
		return listings;
	}
	
	public List<OpenHouse> getOpenHouses() {
		return openHouses;
	}
}
