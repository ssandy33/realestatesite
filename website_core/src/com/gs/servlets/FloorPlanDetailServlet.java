package com.gs.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gs.database.FloorPlanDetailDAO;
import com.gs.models.FloorPlanDetail;

public class FloorPlanDetailServlet extends HttpServlet {
	FloorPlanDetailDAO floorPlanDetailDao = FloorPlanDetailDAO.getFloorPlanDetailDAOSingleton();

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			processRequest(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			processRequest(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FloorPlanDetail floorPlan = new FloorPlanDetail();
		int fp = -99;
		
		if(request.getParameter("fp") != null)
			fp = Integer.parseInt(request.getParameter("fp"));
		
		floorPlan = floorPlanDetailDao.getFloorPlan(fp);
		
		request.getSession().setAttribute("floorplan", floorPlan);
		
		request.getRequestDispatcher("/pages/floorplandetail/floorplandetail.jsp").forward(request, response);
		
	}

}
