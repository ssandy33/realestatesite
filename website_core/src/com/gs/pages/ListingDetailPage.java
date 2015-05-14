package com.gs.pages;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gs.database.OpenHouseDAO;
import com.gs.models.Listing;
import com.gs.pages.base.ContentPage;
import com.gs.utils.WebUtils;

public class ListingDetailPage extends ContentPage {

	private Listing listing = null;
	private OpenHouseDAO openHouseDAO = OpenHouseDAO.getOpenHouseDAOSingleton();
	
	public ListingDetailPage(HttpServletRequest request, HttpServletResponse response, HttpSession session, ServletContext oApplication) throws Exception {
		super(request);
		populateValues(session, request);
	}
	
	private void populateValues(HttpSession session, HttpServletRequest request) {
		listing = (Listing)request.getAttribute("listing");

		if (listing.getOpenHouse() == null)
			listing.setOpenHouse(openHouseDAO.getNextOpenHouse(listing.getId()));
	}

	public Listing getListing() {
		return listing;
	}

	public void setListing(Listing listing) {
		this.listing = listing;
	}
}
