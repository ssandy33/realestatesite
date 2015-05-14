package com.gs.servlets;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;

import com.gs.database.ListingDAO;
import com.gs.models.Listing;

public class ListingDetailsPageServlet extends HttpServlet {
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
		int id = -99;
		Listing listing;
		String[] extensions = new String[] { "jpg", "gif", "png", "jpeg" };
		
		if(request.getParameter("listing") != null)
            id = Integer.parseInt(request.getParameter("listing"));
		
		listing = listingsDao.getCsvListingById(id);
		
		File dir = new File(request.getSession().getServletContext().getRealPath(listing.getImageDirectory()));
		Collection<File> files = FileUtils.listFiles(dir, extensions, false);
		
		if (files != null) {
			List<File> sList = new ArrayList<File>(files);
			Collections.sort(sList, new Comparator<File>() {
				public int compare(File o1, File o2) {
					return o1.compareTo(o2);
				}
			});
			listing.setListingImages(sList);
		}

		request.setAttribute("listing", listing);
		
		request.getRequestDispatcher("/pages/details/listing_details.jsp").forward(request, response);
	}

}
