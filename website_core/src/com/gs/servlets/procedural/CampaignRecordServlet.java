package com.gs.servlets.procedural;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gs.database.CampaignDAO;
import com.gs.database.CampaignHitDAO;
import com.gs.database.ContactDAO;
import com.gs.database.RedirectUrlDAO;
import com.gs.models.Campaign;
import com.gs.models.CampaignHit;
import com.gs.models.Contact;
import com.gs.models.RedirectUrl;

public class CampaignRecordServlet extends HttpServlet {
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
		String guid = "";
		int campaignId = -99;
		CampaignDAO Campaigndao = new CampaignDAO();
		RedirectUrlDAO redirectUrlDAO = new RedirectUrlDAO();
		CampaignHitDAO campaignHitDAO = new CampaignHitDAO();
		Campaign campaign;
		RedirectUrl redirectUrl;
		Contact contact;
		CampaignHit campaignHit;
		 Calendar cal = Calendar.getInstance();
		
		if(request.getParameter("guid") != null)
			guid = request.getParameter("guid");
		
		if(request.getParameter("cid") != null)
			campaignId = Integer.parseInt(request.getParameter("cid"));
		
		campaign = Campaigndao.load(campaignId);
		redirectUrl = redirectUrlDAO.load(campaign.getRedirectUrlId());
		
//		if (campaign.getContactAgentBoth() == 1)
			contact = contactDAO.loadByGuid(guid);
		
		campaignHit = new CampaignHit(campaign.getId(), contact.getId(), -99, new Date(System.currentTimeMillis()), new Time(cal.getTime().getTime()));
		campaignHitDAO.save(campaignHit);
		
		request.getRequestDispatcher(redirectUrl.getRedirectUrl()).forward(request, response);
	}

}
