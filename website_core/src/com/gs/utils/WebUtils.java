package com.gs.utils;

import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import com.gs.utils.GenUtils;
import com.gs.collections.StaticLists;
import com.gs.models.Community;
import com.gs.models.FloorPlanDetail;

public class WebUtils {

	public static int parseInt(String sIn) {
		return GenUtils.parseInt(sIn);
	}

    public static String parseString(String sIn) {
    	return GenUtils.parseString(sIn);
    }
    
    public static boolean parseBoolean(String sIn) {
    	return GenUtils.parseBoolean(sIn);
    }
	
	public static void showValues(HttpServletRequest request) {

		Enumeration enumeration = request.getParameterNames();
		while (enumeration.hasMoreElements()) {
			String parameterName = (String) enumeration.nextElement();

			System.out.println("Parameter = " + parameterName);
			System.out.println(request.getParameter(parameterName));
		}

	}
	
	public static ArrayList<Community> getCommunities() {
		
		StaticLists lists = StaticLists.getStaticListsSingleton();
		
		return lists.loadCommunities(false);
	}
	
	public static ArrayList<Community> getCommunitiesWithFloorPlans() {
		
		StaticLists lists = StaticLists.getStaticListsSingleton();
		
		return lists.loadCommunitiesWithFloorPlans(false);
	}
	
	public static ArrayList<FloorPlanDetail> getFloorPlans() {
		StaticLists lists = StaticLists.getStaticListsSingleton();
		
		return lists.loadFloorPlans(false);
	}
}
