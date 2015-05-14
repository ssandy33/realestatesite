package com.gs.pages;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gs.pages.base.ContentPage;
import com.gs.models.Listing;

public class FeaturedListingsPage extends ContentPage {
	
	private List<Listing> listings = null;
	
	public FeaturedListingsPage(HttpServletRequest request, HttpServletResponse response, HttpSession session, ServletContext oApplication) throws Exception {
		super(request);
		populateValues(session, request);
	}
	
	private void populateValues(HttpSession session, HttpServletRequest request) {
		listings = (List<Listing>)session.getAttribute("listings");
	}
	
	public List<Listing> getListings() {
		return listings;
	}
}
