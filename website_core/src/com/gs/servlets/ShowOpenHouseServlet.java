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
import org.apache.commons.io.comparator.NameFileComparator;

import com.gs.database.CvsMlsOpenHouseListingDAO;
import com.gs.database.ListingDAO;
import com.gs.database.OpenHouseDAO;
import com.gs.database.CsvMlsListingDAO;
import com.gs.models.CsvMlsOpenHouseListing;
import com.gs.models.Listing;
import com.gs.models.OpenHouse;

public class ShowOpenHouseServlet extends HttpServlet {
	ListingDAO listingsDao = ListingDAO.getListingDAOSingleton();
	OpenHouseDAO openHousesDAO = OpenHouseDAO.getOpenHouseDAOSingleton();

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
		OpenHouse openHouse = null;
		CsvMlsOpenHouseListing listing;
		String[] extensions = new String[] { "jpg", "gif", "png", "jpeg" };
		CvsMlsOpenHouseListingDAO csvMlsListingsDao = CvsMlsOpenHouseListingDAO.getCvsMlsOpenHouseListingDAOSingleton();
		
		openHouse = openHousesDAO.getNextOpenHouse();
		
		listing = csvMlsListingsDao.getCsvMlsOpenHouseListingById(openHouse.getListingId());
		listing.setOpenHouse(openHouse);
		
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
