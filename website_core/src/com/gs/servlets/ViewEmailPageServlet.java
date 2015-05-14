package com.gs.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gs.utils.WebUtils;

public class ViewEmailPageServlet extends HttpServlet {

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
		String guid;
		int etp;
		guid =  WebUtils.parseString(request.getParameter("guid"));
		etp =  WebUtils.parseInt(request.getParameter("etp"));
		request.getSession().setAttribute("guid", guid);
		request.getSession().setAttribute("etp", etp);
		request.getRequestDispatcher("/emails/view.jsp").forward(request, response);
	}

}
