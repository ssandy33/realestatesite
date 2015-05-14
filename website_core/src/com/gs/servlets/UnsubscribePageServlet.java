package com.gs.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gs.database.AgentDAO;
import com.gs.models.Agent;
import com.gs.utils.WebUtils;

public class UnsubscribePageServlet extends HttpServlet {

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
		guid =  WebUtils.parseString(request.getParameter("guid"));
		unsubscribe(guid);
		request.getRequestDispatcher("/unsubscribe/unsubscribe.jsp").forward(request, response);
	}
	
	private void unsubscribe(String guid) {
		AgentDAO agentDAO = new AgentDAO();
		Agent agent = null;
		
		agent = agentDAO.loadByGuid(guid);
		
		if (agent != null)
			agentDAO.unsubscribe(agent);
	}

}
