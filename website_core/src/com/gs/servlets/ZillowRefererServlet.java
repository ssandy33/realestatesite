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

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

import com.gs.database.WebSiteActivityDAO;
import com.gs.models.WebSiteActivity;

public class ZillowRefererServlet extends HttpServlet {
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
		DateTime zoned = DateTime.now(DateTimeZone.forID("America/Phoenix"));
		Timestamp tstamp = new Timestamp(zoned.getMillis());
		
		try {
			WebSiteActivity webSiteActivity = new WebSiteActivity(tstamp, 1, 0);
		
			webSiteActivityDAO.Add(webSiteActivity);
		} catch (Exception e){}
		
		request.getRequestDispatcher("/pages/about/about.jsp?").forward(request, response);
	}

}
