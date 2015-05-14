package com.gs.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gs.database.ListingDAO;
import com.gs.database.OpenHouseDAO;
import com.gs.models.Listing;
import com.gs.models.OpenHouse;

public class AdminPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ListingDAO listingsDao = ListingDAO.getListingDAOSingleton();
	OpenHouseDAO openHousesDao = OpenHouseDAO.getOpenHouseDAOSingleton();

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
		List<Listing> listings = null;
		List<OpenHouse> openHouses = null;
		
		listings = loadListings();
		openHouses = loadOpenHouses();
		
		request.setAttribute("listings", listings);
		request.setAttribute("openhouses", openHouses);
		
		request.getRequestDispatcher("/pages/admin/gabbyspage.jsp?").forward(request, response);
	}
	
	private List<Listing> loadListings() {
		return listingsDao.getFeaturedListings();
	}
	
	private List<OpenHouse> loadOpenHouses() {
		return openHousesDao.getAllValidOpenHouses();
	}

}
