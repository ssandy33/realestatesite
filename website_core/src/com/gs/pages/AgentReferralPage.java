package com.gs.pages;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gs.database.AgentDAO;
import com.gs.models.Agent;
import com.gs.pages.base.ContentPage;
import com.gs.pages.base.PageSessionSingleton;
import com.gs.pages.base.SpecialHeaderPage;
import com.gs.utils.GenUtils;
import com.gs.utils.WebUtils;

public class AgentReferralPage extends SpecialHeaderPage {
	AgentDAO agentDAO = null;
	Agent agent = null;

	public AgentReferralPage(HttpServletRequest request, HttpServletResponse response, HttpSession session, ServletContext oApplication) {
		super(request);
		loadAgent(request);
		pageSessionSingleton.setAgentReferralLink(request, true);
	}
	
	private void loadAgent(HttpServletRequest request) {
		String guid = null;
		agentDAO = new AgentDAO();
		
		guid =  GenUtils.parseString(request.getParameter("guid"));
		
		if (guid != null)
			agent = agentDAO.loadByGuid(guid);
	}
	
	public String getAgentFirstName() {
		if (agent != null)
			return agent.getFirstName();
		return "";
	}
	
	public String getAgentLastName() {
		if (agent != null)
			return agent.getLastName();
		return "";
	}
	
	public String getAgentEmail() {
		if (agent != null)
			return agent.getEmail();
		return "";
	}
	
	public String getAgentCell1() {
		if (agent != null)
			return agent.getCell1();
		return "";
	}
	
	public String getAgentCell2() {
		if (agent != null)
			return agent.getCell2();
		return "";
	}
	
	public String getAgentCell3() {
		if (agent != null)
			return agent.getCell3();
		return "";
	}
	
	public String getAgentGuid() {
		if (agent != null)
			return agent.getGuid();
		return "";
	}
}
