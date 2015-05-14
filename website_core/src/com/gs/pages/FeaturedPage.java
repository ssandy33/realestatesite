package com.gs.pages;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gs.database.SearchAreaDAO;
import com.gs.models.CsvMlsListing;
import com.gs.models.SearchArea;
import com.gs.pages.base.ContentPage;
import com.gs.utils.WebUtils;

public class FeaturedPage extends ContentPage {

	private List listings = null;
	private int searchAreaId = 1;
	private SearchArea searchArea;
	
	
	public FeaturedPage(HttpServletRequest request, HttpServletResponse response, HttpSession session, ServletContext oApplication) throws Exception {
		super(request);
		populateValues(session, request);
	}
	
	private void populateValues(HttpSession session, HttpServletRequest request) {
		listings = (List<CsvMlsListing>)session.getAttribute("listings");
		searchAreaId = WebUtils.parseInt(request.getParameter("sa"));
		populateSearchArea();
	}
	
	public List<CsvMlsListing> getListings() {
		return listings;
	}

	public int getSearchAreaId() {
		return searchAreaId;
	}
	
	public SearchArea getSearchArea() {
		return searchArea;
	}
	
	private void populateSearchArea() {
		SearchAreaDAO dao = new SearchAreaDAO();
		searchArea = dao.getSearchArea(searchAreaId);
	}
	
}
