package com.gs.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gs.database.CsvMlsListingDAO;
import com.gs.models.CsvMlsListing;

public class OpenHousePageServlet extends HttpServlet {
	CsvMlsListingDAO listingsDao =  CsvMlsListingDAO.getCsvMlsListingDAOSingleton();

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
		CsvMlsListing listing;
		
		listing = listingsDao.getOpenHouse(1);
		
		request.getSession().setAttribute("listing", listing);
		
		request.getRequestDispatcher("/properties/openhouse/open_house.jsp").forward(request, response);
	}

}
