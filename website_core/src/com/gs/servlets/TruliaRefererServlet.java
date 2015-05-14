package com.gs.servlets;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gs.database.WebSiteActivityDAO;
import com.gs.models.WebSiteActivity;

public class TruliaRefererServlet extends HttpServlet  {
	WebSiteActivityDAO webSiteActivityDAO = WebSiteActivityDAO.getWebSiteActivityDAOSingleton();

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
		Calendar cal = GregorianCalendar.getInstance(TimeZone.getDefault());
		Timestamp tstamp = new Timestamp(cal.getTimeInMillis());
		
		try {
			WebSiteActivity webSiteActivity = new WebSiteActivity(tstamp, 0, 1);
		
			webSiteActivityDAO.Add(webSiteActivity);
		} catch (Exception e){}
		
		request.getRequestDispatcher("/pages/about/about.jsp?").forward(request, response);
	}
}
