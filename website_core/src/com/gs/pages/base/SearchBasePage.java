package com.gs.pages.base;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.gs.database.PriceRangeDAO;
import com.gs.database.SearchAreaDAO;
import com.gs.models.PriceRange;
import com.gs.models.SearchArea;
import com.gs.models.SearchOption;

public class SearchBasePage extends ContentPage {

	private SearchOption searchOptions;
	
	public SearchBasePage(HttpServletRequest request) {
		super(request);
		searchOptions = new SearchOption();
	}
	
	public SearchOption getSearchOptions() {
		return searchOptions;
	}
}
