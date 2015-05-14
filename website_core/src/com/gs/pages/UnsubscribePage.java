package com.gs.pages;

import javax.servlet.http.HttpServletRequest;
import com.gs.pages.base.SpecialHeaderPage;

public class UnsubscribePage extends SpecialHeaderPage {

	public UnsubscribePage(HttpServletRequest request) {
		super(request);
		pageSessionSingleton.setAgentReferralLink(request, false);
	}
	
}
