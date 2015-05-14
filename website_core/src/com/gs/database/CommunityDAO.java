package com.gs.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.gs.models.Community;
import com.gs.models.FloorPlan;
import com.gs.models.FloorPlanDetail;
import com.gs.models.SearchArea;

public class CommunityDAO extends BaseDAO {
	
	private static CommunityDAO ref;
	
	private CommunityDAO() {}
	
	public static synchronized CommunityDAO getCommunityDAOSingleton() {
		if (ref == null)
			ref = new CommunityDAO();
		return ref;
	}
	
	public ArrayList<Community> loadCommunitiesWithFloorPlans() {
		ArrayList<Community> communities = loadCommunities();
		ArrayList<FloorPlanDetail> floorPlanDetails = null;
		Iterator<Community> iter = communities.iterator();
		Statement stmt = null;
		Community community = null;
		FloorPlanDetail floorPlanDetail = null;
		
		while (iter.hasNext()) {
			community = iter.next();
			floorPlanDetails = new ArrayList<FloorPlanDetail>();
			
			try {
				connection = getConnection();
				stmt = connection.createStatement();
				String sql = "SELECT id, name, image, square_feet, bed_rooms, bath_rooms, community_id from floor_plans where status = 1 and community_id = " + community.getId();
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
				
				community.setFloorPlanDetails(floorPlanDetails);
				
			}catch (SQLException se) {
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
		}
		
		return communities;
	}
	
	public ArrayList<Community> loadCommunities() {
		ArrayList<Community> communities = new ArrayList<Community>();
		Community community = null;
		Statement stmt = null;

		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, name, abbreviation FROM communities order by display_order";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				community = new Community();
				community.setId(rs.getInt("id"));
				community.setName(rs.getString("name"));
				community.setAbbreviation(rs.getString("abbreviation"));
				
				communities.add(community);
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
		
		return communities;
	}
	
	public Community load(String id) {
		Statement stmt = null;
		Community community = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, name, abbreviation FROM communities where id = '" + id +"'";
			ResultSet rs = stmt.executeQuery(sql);

			community = new Community();
			rs.next();
			community.setId(rs.getInt("id"));
			community.setName(rs.getString("name"));
			community.setAbbreviation(rs.getString("abbreviation"));
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
		
		return community;
	}

}
