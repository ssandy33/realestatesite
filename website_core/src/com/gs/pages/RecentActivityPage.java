package com.gs.pages;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gs.database.CommunityDAO;
import com.gs.models.Community;
import com.gs.pages.base.SpecialHeaderPage;
import com.gs.utils.GenUtils;

public class RecentActivityPage extends SpecialHeaderPage {
	
	private Community community;
	private String image;
	private int imageId;

	public RecentActivityPage(HttpServletRequest request, HttpServletResponse response, HttpSession session, ServletContext oApplication) {
		super(request);
		loadCommunityName(request);
		loadImage(request);
		pageSessionSingleton.setRecentActivityLink(request, true);
	}
	
	private void loadCommunityName(HttpServletRequest request) {
		String id;
		CommunityDAO dao = CommunityDAO.getCommunityDAOSingleton();
		
		id = GenUtils.parseString(request.getParameter("com"));
		community = dao.load(id);
	}

	private void loadImage(HttpServletRequest request) {
		imageId = GenUtils.parseInt(request.getParameter("im"));
	}
	
	public Community getCommunity() {
		return community;
	}

	public String getImage() {
		return image;
	}
	
	public int getImageId() {
		return imageId;
	}

}
