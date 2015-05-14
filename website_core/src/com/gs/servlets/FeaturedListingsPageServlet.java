package com.gs.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gs.database.ListingDAO;

public class FeaturedListingsPageServlet extends HttpServlet  {
	ListingDAO listingsDao = ListingDAO.getListingDAOSingleton();
	
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
		List listings = null;
		
		listings = listingsDao.getFeaturedListings();
		
		request.getSession().setAttribute("listings", listings);
		
		request.getRequestDispatcher("/pages/featured/featured_listings.jsp").forward(request, response);
	}
}