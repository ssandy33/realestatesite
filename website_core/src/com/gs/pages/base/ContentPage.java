package com.gs.pages.base;

import javax.servlet.http.HttpServletRequest;

import com.gs.utils.GenUtils;

public class ContentPage {

	private boolean bRunPage = true;
	private boolean bShowPropertiesMenuLink = true;
	protected PageSessionSingleton pageSessionSingleton = null;
	
	public ContentPage(HttpServletRequest request) {
//		pageSessionSingleton = PageSessionSingleton.getInstance(request);
//		pageSessionSingleton.setPropertiesMenuLink(request, true);
//		pageSessionSingleton.setServicesMenuLink(request, false);
//		pageSessionSingleton.setAboutMenuLink(request, false);
//		pageSessionSingleton.setAgentReferralLink(request, false);
	}
	
	public void setRunPage(boolean b)
	{
		bRunPage = b;
	}
	
	public boolean getRunPage()
	{
		return bRunPage;		
	}
}
