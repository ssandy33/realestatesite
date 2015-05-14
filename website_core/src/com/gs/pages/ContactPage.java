package com.gs.pages;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gs.pages.base.ContentPage;

public class ContactPage extends ContentPage {

	public ContactPage(HttpServletRequest request, HttpServletResponse response, HttpSession session, ServletContext oApplication) {
		super(request);
	}

}
