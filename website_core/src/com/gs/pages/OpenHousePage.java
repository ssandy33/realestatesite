package com.gs.pages;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gs.models.CsvMlsListing;
import com.gs.pages.base.ContentPage;
import com.gs.utils.WebUtils;

public class OpenHousePage extends ContentPage {
	CsvMlsListing listing;
	
	public OpenHousePage(HttpServletRequest request, HttpServletResponse response, HttpSession session, ServletContext oApplication) throws Exception {
		super(request);
		populateValues(session, request);
	}
	
	private void populateValues(HttpSession session, HttpServletRequest request) {
		listing = (CsvMlsListing)session.getAttribute("listing");
	}

	public CsvMlsListing getListing() {
		return listing;
	}

	public void setListing(CsvMlsListing listing) {
		this.listing = listing;
	}

}
