package com.gs.pages.base;

import javax.servlet.http.HttpServletRequest;

public class PageSessionSingleton {

	private static PageSessionSingleton instance = null;

	protected PageSessionSingleton() {
	}

	public static PageSessionSingleton getInstance(HttpServletRequest request) {
		if (instance == null) {
			instance = new PageSessionSingleton();
		}
		return instance;
	}

	public static boolean showPropertiesMenuLink(HttpServletRequest request) {
		if (request.getSession().getAttribute("showpropertiesmenulink") == null) {
			request.setAttribute("showpropertiesmenulink", true);
			return true;
		} else {
			return new Boolean((Boolean) request.getSession().getAttribute("showpropertiesmenulink")).booleanValue();
		}
	}

	public static boolean showServicesMenuLink(HttpServletRequest request) {
		if (request.getSession().getAttribute("showservicessmenulink") == null) {
			request.setAttribute("showservicessmenulink", false);
			return false;
		} else {
			return new Boolean((Boolean) request.getSession().getAttribute("showservicessmenulink")).booleanValue();
		}
	}

	public static boolean showAboutMenuLink(HttpServletRequest request) {
		if (request.getSession().getAttribute("showaboutmenulink") == null) {
			request.setAttribute("showaboutmenulink", false);
			return false;
		} else {
			return new Boolean((Boolean) request.getSession().getAttribute("showaboutmenulink")).booleanValue();
		}
	}

	public static boolean showAgentReferralMenuLink(HttpServletRequest request) {
		if (request.getSession().getAttribute("showagentreferrallink") == null) {
			request.setAttribute("showagentreferrallink", false);
			return false;
		} else {
			return new Boolean((Boolean) request.getSession().getAttribute("showagentreferrallink")).booleanValue();
		}
	}
	
	public static boolean showRecentActivityLink(HttpServletRequest request) {
		if (request.getSession().getAttribute("showrecentactivitylink") == null) {
			request.setAttribute("showrecentactivitylink", false);
			return false;
		} else {
			return new Boolean((Boolean) request.getSession().getAttribute("showrecentactivitylink")).booleanValue();
		}
	}

	public static void setPropertiesMenuLink(HttpServletRequest request, Boolean show) {
		if (request.getSession().getAttribute("showpropertiesmenulink") == null) {
			request.getSession().setAttribute("showpropertiesmenulink", show);
		}
	}
	
	public static void setServicesMenuLink(HttpServletRequest request, Boolean show) {
		if (request.getSession().getAttribute("showservicessmenulink") == null) {
			request.getSession().setAttribute("showservicessmenulink", show);
		}
	}
	
	public static void setAboutMenuLink(HttpServletRequest request, Boolean show) {
		if (request.getSession().getAttribute("showaboutmenulink") == null) {
			request.getSession().setAttribute("showaboutmenulink", show);
		}
	}
	
	public static void setAgentReferralLink(HttpServletRequest request, Boolean show) {
		if (request.getSession().getAttribute("showagentreferrallink") == null) {
			request.getSession().setAttribute("showagentreferrallink", show);
		}
	}
	
	public static void setRecentActivityLink(HttpServletRequest request, Boolean show) {
		if (request.getSession().getAttribute("showrecentactivitylink") == null) {
			request.getSession().setAttribute("showrecentactivitylink", show);
		}
	}
	
	public static void hideTypicalHeaderLinks(HttpServletRequest request) {
		request.getSession().setAttribute("showpropertiesmenulink", false);
		request.getSession().setAttribute("showservicessmenulink", false);
		request.getSession().setAttribute("showaboutmenulink", false);
	}
	
}
