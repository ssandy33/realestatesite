package com.gs.pages.base;

import javax.servlet.http.HttpServletRequest;

public class SpecialHeaderPage {
	private boolean bRunPage = true;
	protected PageSessionSingleton pageSessionSingleton = null;
	
	public SpecialHeaderPage(HttpServletRequest request) {
		pageSessionSingleton = PageSessionSingleton.getInstance(request);
		pageSessionSingleton.hideTypicalHeaderLinks(request);
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
