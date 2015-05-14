package com.gs.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gs.database.CsvMlsListingDAO;
import com.gs.models.CsvMlsListing;
import com.gs.utils.WebUtils;


public class FeaturedSearchServlet extends HttpServlet  {
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
		int searchArea = 1;
		HttpSession session = request.getSession(true);

		searchArea = WebUtils.parseInt(request.getParameter("sa"));
//		List listings = listingsDao.getAllCsvListings(searchArea);
//		session.setAttribute("listings",listings);
		
		request.getRequestDispatcher("/properties/featured/featured.jsp?sa=" + searchArea).forward(request, response);
	}

}
