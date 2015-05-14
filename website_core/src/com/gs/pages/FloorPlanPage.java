package com.gs.pages;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.gs.database.FloorPlanDetailDAO;
import com.gs.models.Community;
import com.gs.models.FloorPlanDetail;
import com.gs.pages.base.ContentPage;
import com.gs.pages.base.SpecialHeaderPage;
import com.gs.utils.WebUtils;

public class FloorPlanPage extends ContentPage {

	private ArrayList<FloorPlanDetail> floorPlans;
	private ArrayList<Community> communities;
	
	public FloorPlanPage(HttpServletRequest request) {
		super(request);
		loadCommunities();
//		loadFloorPlans();
	}
	
	private void loadCommunities() {
		communities = WebUtils.getCommunitiesWithFloorPlans();
	}
	
	private void loadFloorPlans() {
		floorPlans = WebUtils.getFloorPlans();
	}

	public ArrayList<FloorPlanDetail> getFloorPlans() {
		return floorPlans;
	}

	public ArrayList<Community> getCommunities() {
		return communities;
	}
}
