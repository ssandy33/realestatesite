package com.gs.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.gs.models.Community;
import com.gs.models.FloorPlanDetail;

public class FloorPlanDetailDAO extends BaseDAO {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	
	public static FloorPlanDetailDAO ref;
	
	private FloorPlanDetailDAO() {}
	
	public static synchronized FloorPlanDetailDAO getFloorPlanDetailDAOSingleton() {
		if (ref == null)
			ref = new FloorPlanDetailDAO();
		return ref;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public ArrayList<FloorPlanDetail> loadFloorPlans() {
		ArrayList<FloorPlanDetail> floorPlanDetails = new ArrayList<FloorPlanDetail>();
		FloorPlanDetail floorPlanDetail = null;
		Statement stmt = null;

		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, name, image, community_id, square_feet, bed_rooms, bath_rooms FROM floor_plans WHERE status = 1";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				floorPlanDetail = new FloorPlanDetail();
				floorPlanDetail.setId(rs.getInt("id"));
				floorPlanDetail.setName(rs.getString("name"));
				floorPlanDetail.setImage(rs.getString("image"));
				floorPlanDetail.setCommunityId(rs.getInt("community_id"));
				floorPlanDetail.setSquareFeet(rs.getString("square_feet"));
				floorPlanDetail.setBedRooms(rs.getInt("bed_rooms"));
				floorPlanDetail.setBathRooms(rs.getInt("bath_rooms"));
				
				floorPlanDetails.add(floorPlanDetail);
			}
			rs.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					connection.close();
			} catch (SQLException se) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return floorPlanDetails;
	}
	
	public ArrayList getFloorPlanByCommunity(int id) {
		Statement stmt = null;
		FloorPlanDetail floorPlan = null;
		ArrayList floorPlans = new ArrayList();
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT fp.id, fp.name, fp.image, fp.community_id, c.name as 'community_name', fp.square_feet FROM floor_plans fp INNER JOIN communities c on c.id = fp.community_id WHERE status = 1 and community_id = " + id;
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				floorPlan = createFloorPlan(rs);
				floorPlans.add(floorPlan);
			}
			rs.close();
			
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					connection.close();
			} catch (SQLException se) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return floorPlans;
		
	}
	
	public FloorPlanDetail getFloorPlan(int id) {
		Statement stmt = null;
		FloorPlanDetail floorPlan = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT fp.id, fp.name, fp.image, fp.community_id, c.name as 'community_name', fp.square_feet, " +
					" fp.bed_rooms, fp.bath_rooms, c.abbreviation " +
					" FROM floor_plans fp " +
					" INNER JOIN communities c on c.id = fp.community_id " +
					" WHERE fp.status = 1 " +
					" AND fp.id = " + id;
			
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			
			if (rs != null) {
				floorPlan = createFloorPlan(rs);
				rs.close();
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					connection.close();
			} catch (SQLException se) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return floorPlan;
	}
	
	private FloorPlanDetail createFloorPlan(ResultSet rs) {
		FloorPlanDetail floorPlan;
		
		floorPlan = new FloorPlanDetail();
		
		try {
			floorPlan.setId(rs.getInt("fp.id"));
			floorPlan.setName(rs.getString("fp.name"));
			floorPlan.setImage(rs.getString("fp.image"));
			floorPlan.setCommunityId(rs.getInt("fp.community_id"));
			floorPlan.setCommunityName(rs.getString("community_name"));
			floorPlan.setSquareFeet(rs.getString("fp.square_feet"));
			floorPlan.setBathRooms(rs.getFloat("fp.bath_rooms"));
			floorPlan.setBedRooms(rs.getInt("fp.bed_rooms"));
			floorPlan.setCommunityAbbreviation(rs.getString("c.abbreviation"));
		} catch (SQLException e) {
			e.toString();
		}
		
		return floorPlan;
		
	}

}
