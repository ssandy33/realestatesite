package com.gs.pages;

import javax.servlet.http.HttpServletRequest;
import com.gs.pages.base.SpecialHeaderPage;

public class ThankYouPage extends SpecialHeaderPage {

	public ThankYouPage(HttpServletRequest request) {
		super(request);
		pageSessionSingleton.setAgentReferralLink(request, true);
	}
	
}
