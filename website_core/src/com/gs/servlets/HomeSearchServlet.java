package com.gs.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gs.database.CsvMlsListingDAO;
import com.gs.utils.WebUtils;

public class HomeSearchServlet extends HttpServlet  {
	CsvMlsListingDAO listingsDao = CsvMlsListingDAO.getCsvMlsListingDAOSingleton();

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			processRequest(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			processRequest(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		WebUtils.showValues(request);
		List listings;
		int numRecords;
        int page = 1;
        int recordsPerPage = 5;
        String searchArea = null;
        String sqft = null;
        String minPrice = null;
        String maxPrice = null;
        String minBed = null;
        String minBath = null;
        String sort = null;
        String order = null;
        
        
        if(request.getParameter("page") != null)
            page = Integer.parseInt(request.getParameter("page"));
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
        if(request.getParameter("sort") != null)
        	sort = request.getParameter("sort");
        if(request.getParameter("order") != null)
        	order = request.getParameter("order");
		
		listings = listingsDao.getCsvListingsForPagination(searchArea, sqft, minPrice, maxPrice, minBed, minBath,(page-1)*recordsPerPage, recordsPerPage, order, sort);
		numRecords = listingsDao.getPaginationRecords();
        int numPages = (int) Math.ceil(numRecords * 1.0 / recordsPerPage);
        request.setAttribute("numPages", numPages);
        request.setAttribute("currentPage", page);
		
		request.setAttribute("listings", listings);
		request.getRequestDispatcher("/search/search.jsp").forward(request, response);
	}

}
