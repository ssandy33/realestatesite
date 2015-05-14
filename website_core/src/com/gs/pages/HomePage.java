package com.gs.pages;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Iterator;

import com.gs.database.PriceRangeDAO;
import com.gs.database.SearchAreaDAO;
import com.gs.models.CsvMlsListing;
import com.gs.models.PriceRange;
import com.gs.models.SearchArea;
import com.gs.pages.base.SearchBasePage;

public class HomePage extends SearchBasePage {
	
	public HomePage(HttpServletRequest request, HttpServletResponse response, HttpSession session, ServletContext oApplication) throws Exception {
		super(request);
	}

}
