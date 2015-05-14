package com.gs.servlets.procedural;

import java.sql.Date;
import java.sql.Timestamp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gs.database.OpenHouseDAO;
import com.gs.models.OpenHouse;
import com.gs.utils.GenUtils;

public class OpenHouseServlet extends HttpServlet {
	OpenHouseDAO openHouseDAO = OpenHouseDAO.getOpenHouseDAOSingleton();
	
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
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
		int actionType = GenUtils.parseInt(request.getParameter("actiontype"));
		
		switch (actionType) {
			case 1:
				createListing(request);
				break;
			case 2:
				getListings();
				break;
			case 3:
				getLastOpenHouse();
				break;
			case 4:
				delete(request);
				break;
		}
	}
	
	private void delete(HttpServletRequest request) {
		int openhouseid = GenUtils.parseInt(request.getParameter("openhouseid"));
		openHouseDAO.delete(openhouseid);
	}
	
	private void getLastOpenHouse() {
		OpenHouse openHouse = null;
		openHouse = openHouseDAO.getLastOpenHouse();
	}
	
	private void getListings() {
		openHouseDAO.getAllValidOpenHouses();
	}
	
	private void createListing(HttpServletRequest request) {
		
		int listingId = GenUtils.parseInt(request.getParameter("listingId"));
		Timestamp start = GenUtils.parseSqlTimestamp(request.getParameter("start"));
		Timestamp end = GenUtils.parseSqlTimestamp(request.getParameter("end"));
		
		OpenHouse openHouse = new OpenHouse(listingId, start, end);
		
		openHouseDAO.create(openHouse);
	}

}
