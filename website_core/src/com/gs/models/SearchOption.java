package com.gs.models;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.gs.database.PriceRangeDAO;
import com.gs.database.SearchAreaDAO;
import com.gs.utils.WebUtils;

public class SearchOption {

	private List<SearchArea> searchAreas;
	private List<PriceRange> minRanges;
	private List<PriceRange> maxRanges;


	public SearchOption() {
		super();
	}
	
	public String getMaxPriceRangeOptions() {
		Iterator<PriceRange> it;
		PriceRange priceRange;
		StringBuffer options = new StringBuffer(
				"<option value='-99'>Any</option>");

		populateMaxRanges();

		it = maxRanges.iterator();

		while (it.hasNext()) {
			priceRange = it.next();
			options.append("<option value='" + priceRange.getValue() + "'>"
					+ priceRange.getLabel() + "</option>");
		}

		return options.toString();
	}

	public String getMinPriceRangeOptions() {
		Iterator<PriceRange> it;
		PriceRange priceRange;
		StringBuffer options = new StringBuffer();

		populateMinRanges();

		it = minRanges.iterator();

		while (it.hasNext()) {
			priceRange = it.next();
			options.append("<option value='" + priceRange.getValue() + "'>"
					+ priceRange.getLabel() + "</option>");
		}

		return options.toString();
	}

	public String getSearchAreasAsSelectOptions() {
		Iterator<SearchArea> it;
		SearchArea area;
		populateSearchAreas();
		StringBuffer options = new StringBuffer(
				"<option value='0'>Any</option>");

		it = searchAreas.iterator();

		while (it.hasNext()) {
			area = it.next();
			options.append("<option value='" + area.getId() + "'>"
					+ area.getName() + "</option>");
		}

		return options.toString();
	}

	private void populateSearchAreas() {
		SearchAreaDAO searchAreaDAO = new SearchAreaDAO();
		searchAreas = searchAreaDAO.getAllSearchAreas();
	}

	private void populateMinRanges() {
		PriceRangeDAO priceRangeDAO = new PriceRangeDAO();
		minRanges = priceRangeDAO.getMinPriceRangesAsSelectOptions();
	}

	private void populateMaxRanges() {
		PriceRangeDAO priceRangeDAO = new PriceRangeDAO();
		maxRanges = priceRangeDAO.getMaxPriceRangesAsSelectOptions();
	}
}
