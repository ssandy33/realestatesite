package com.gs.pages;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gs.models.CsvMlsListing;
import com.gs.models.SearchOption;
import com.gs.pages.base.SearchBasePage;
import com.gs.utils.WebUtils;

public class SearchPage extends SearchBasePage {
	
	private boolean showListings = false;
	private List<CsvMlsListing> listings;
	private int currentPage = 1;
	private int numPages = 1;
	SearchOption searchOption;
	private String searchArea;
	private String sqft;
	private String minPrice;
	private String maxPrice;
	private String minBed;
	private String minBath;
	
	public SearchPage(HttpServletRequest request, HttpServletResponse response, HttpSession session, ServletContext oApplication) throws Exception {
		super(request);
		loadProperties(request);
		loadListings(request);
	}

	private void loadListings(HttpServletRequest request) {
		listings = (List<CsvMlsListing>) request.getAttribute("listings");
		if (listings != null && listings.size() > 0)
			showListings = true;
		else
			showListings = false;
	}
	
	private void loadProperties(HttpServletRequest request) {
//		WebUtils.showValues(request);
        if(request.getAttribute("numPages") != null)
        	numPages = (Integer)request.getAttribute("numPages");
        if(request.getAttribute("currentPage") != null)
        	currentPage = (Integer)request.getAttribute("currentPage");       
        if(request.getParameter("searchArea") != null)
        	searchArea = request.getParameter("searchArea");
        if(request.getParameter("sqft") != null)
        	sqft = request.getParameter("sqft");
        if(request.getParameter("minPrice") != null)
        	minPrice = request.getParameter("minPrice");
        if(request.getParameter("maxPrice") != null)
        	maxPrice = request.getParameter("maxPrice");
        if(request.getParameter("minBed") != null)
        	minBed = request.getParameter("minBed");
        if(request.getParameter("minBath") != null)
        	minBath = request.getParameter("minBath");
        
	}

	public List<CsvMlsListing> getListings() {
		return listings;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}

	public int getNumPages() {
		return numPages;
	}

	public String getSearchArea() {
		return searchArea;
	}

	public String getSqft() {
		return sqft;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public String getMinBed() {
		return minBed;
	}

	public String getMinBath() {
		return minBath;
	}
	
}
