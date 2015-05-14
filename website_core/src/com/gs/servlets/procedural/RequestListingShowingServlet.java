package com.gs.servlets.procedural;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gs.database.ContactDAO;
import com.gs.database.ListingDAO;
import com.gs.email.EmailTemplates;
import com.gs.email.SendEmail;
import com.gs.enums.AcquisitionMethods;
import com.gs.models.Contact;
import com.gs.utils.GenUtils;
import com.gs.utils.WebUtils;

public class RequestListingShowingServlet extends HttpServlet {
	ListingDAO listingsDao = ListingDAO.getListingDAOSingleton();
	SendEmail sendEmail = SendEmail.getSendEmailSingleton();
	ContactDAO contactDAO = ContactDAO.getContactDAOSingleton();
	
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
		Contact contact = null;
		boolean success = false;
		
		int listingId = WebUtils.parseInt(request.getParameter("requestshowinglistingid"));
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String msg = request.getParameter("msg");
		
		contact = new Contact(firstName, lastName, email, phone1, phone2, phone3, AcquisitionMethods.REQUESTMLSSHOWINGFROMWEBSITE.getValue());
		
		response.setContentType("text/plain");
		
        try {
        	success = sendEmail.sendRequestListingShowingEmail(EmailTemplates.RequestListingShowing, listingsDao.getCsvListingById(listingId), contact, msg);
        	success = contactDAO.Add(contact);
        	
//    		System.out.println("{\"success\": \"true\"}");
        	if (success)
        		response.getWriter().write("{\"success\": \"true\"}");
        	else
        		response.getWriter().write("{\"success\": \"false\"}");
		} catch (IOException e) {
			response.getWriter().write("{\"success\": \"false\"}");
		}
	}
}
