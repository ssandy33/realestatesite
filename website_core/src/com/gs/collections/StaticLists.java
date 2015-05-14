package com.gs.collections;

import java.util.ArrayList;
import java.util.List;

import com.gs.database.CommunityDAO;
import com.gs.database.FloorPlanDetailDAO;
import com.gs.models.Community;
import com.gs.models.FloorPlanDetail;

public class StaticLists {
	private ArrayList<Community> communities = null;
	private ArrayList<FloorPlanDetail> floorPlans = null;

	private static StaticLists ref;
	
	private StaticLists() {}
	
	public static synchronized StaticLists getStaticListsSingleton() {
		if (ref == null)
			ref = new StaticLists();
		return ref;
	}
	
	public void clearLists() {
		communities = null;
		floorPlans = null;
	}
	
	public ArrayList<Community> loadCommunitiesWithFloorPlans(boolean forceReload) {
		CommunityDAO communityDAO = CommunityDAO.getCommunityDAOSingleton();
		
		if (communities == null || communities.size() < 1 || forceReload) {
			communities = communityDAO.loadCommunitiesWithFloorPlans();
		}
		
		return communities;
	}
	
	public ArrayList<Community> loadCommunities(boolean forceReload) {
		CommunityDAO communityDAO = CommunityDAO.getCommunityDAOSingleton();
		
		if (communities == null || communities.size() < 1 || forceReload) {
			communities = communityDAO.loadCommunities();
		}
		
		return communities;
	}
	
	public ArrayList<FloorPlanDetail> loadFloorPlans(boolean forceReload) {
		FloorPlanDetailDAO floorPlanDetailDAO = FloorPlanDetailDAO.getFloorPlanDetailDAOSingleton();
		
		if (floorPlans == null || floorPlans.size() < 1 || forceReload) {
			floorPlans = floorPlanDetailDAO.loadFloorPlans();
		}
		
		return floorPlans;
	}

}
