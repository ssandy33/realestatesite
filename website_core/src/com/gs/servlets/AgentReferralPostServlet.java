package com.gs.servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gs.database.AgentDAO;
import com.gs.database.AgentReferralDAO;
import com.gs.email.EmailTemplates;
import com.gs.email.SendEmail;
import com.gs.models.Agent;
import com.gs.models.AgentReferral;
import com.gs.utils.GenUtils;
import com.gs.utils.WebUtils;

public class AgentReferralPostServlet extends HttpServlet  {
	AgentDAO agentDAO = new AgentDAO();
	AgentReferralDAO agentReferralDAO = new AgentReferralDAO();
	SendEmail sendEmail = SendEmail.getSendEmailSingleton();

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
		WebUtils.showValues(request);
		updateAgentValues(request);
		saveContactForm(request);
		sendEmail(request);
		request.getRequestDispatcher("/ThankYou").forward(request, response);
	}
	
	private void saveContactForm(HttpServletRequest request) {
		AgentReferral agentReferral = createAgentReferral(request);
		
		agentReferralDAO.Add(agentReferral);		
	}
	
	private void updateAgentValues(HttpServletRequest request) {
		Agent agent = createAgent(request);
		
		if (agent != null && agent.isChanged())
			agentDAO.updateAgent(agent);
	}
	
	private void sendEmail(HttpServletRequest request) {
		Agent agent = createAgent(request);
		
//		sendEmail.sendEmail(EmailTemplates.NewAgentReferralContact, agent);
	}
	
	private AgentReferral createAgentReferral(HttpServletRequest request) {
		Agent agent;
		AgentReferral agentReferral = new AgentReferral();
		String guid;
		String comments;
		
		guid = GenUtils.parseString(request.getParameter("guid"));
		comments = GenUtils.parseString(request.getParameter("comments"));
		Date dt = new Date(System.currentTimeMillis()); 
		agent = agentDAO.loadByGuid(guid);
		
		agentReferral.setAgentId(agent.getId());
		agentReferral.setComments(comments);
		agentReferral.setCreatedAt(dt);
		
		return agentReferral;
	}
	
	private Agent createAgent(HttpServletRequest request) {
		Agent agent;
		String guid;
		String cell1;
		String cell2;
		String cell3;
		String firstName;
		String lastName;
		String email;
		email = GenUtils.parseString(request.getParameter("email"));
		cell1 = GenUtils.parseString(request.getParameter("cell1"));
		cell2 = GenUtils.parseString(request.getParameter("cell2"));
		cell3 = GenUtils.parseString(request.getParameter("cell3"));
		firstName = GenUtils.parseString(request.getParameter("firstName"));
		lastName = GenUtils.parseString(request.getParameter("lastName"));
		guid = GenUtils.parseString(request.getParameter("guid"));
		
		agent = agentDAO.loadByGuid(guid);
		
		if (agent != null) {
			if (!agent.getCell1().equalsIgnoreCase(cell1)) {
				agent.setCell1(cell1);
				agent.setChanged(true);
			}
			
			if (!agent.getCell2().equalsIgnoreCase(cell2)) {
				agent.setCell2(cell2);
				agent.setChanged(true);
			}
			
			if (!agent.getCell3().equalsIgnoreCase(cell3)) {
				agent.setCell3(cell3);
				agent.setChanged(true);
			}
			
			if (!agent.getFirstName().equalsIgnoreCase(firstName)) {
				agent.setFirstName(firstName);
				agent.setChanged(true);
			}
			
			if (!agent.getLastName().equalsIgnoreCase(lastName)) {
				agent.setLastName(lastName);
				agent.setChanged(true);
			}
			
			if (!agent.getEmail().equalsIgnoreCase(email)) {
				agent.setEmail(email);
				agent.setChanged(true);
			}
		}
		
		return agent;
	}

}
