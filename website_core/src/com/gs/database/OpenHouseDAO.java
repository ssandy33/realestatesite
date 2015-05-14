package com.gs.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gs.models.Listing;
import com.gs.models.OpenHouse;

public class OpenHouseDAO extends BaseDAO {

	private static OpenHouseDAO ref;
	
	private OpenHouseDAO(){}
	
	public static synchronized OpenHouseDAO getOpenHouseDAOSingleton() {
		if (ref == null)
			ref = new OpenHouseDAO();
		return ref;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public OpenHouse getNextOpenHouse(int id) {
		Statement stmt = null;
		OpenHouse openHouse = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT oh.id, oh.listing_id, oh.start_datetime, oh.end_datetime " +
					" FROM open_houses oh " +
					" WHERE oh.status = 1" +
					" AND oh.listing_id = " + id +
					" AND oh.start_datetime >= (CURRENT_TIMESTAMP() - INTERVAL 1 DAY)" +
					" ORDER BY oh.start_datetime LIMIT 1";
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			if (rs.next())
				openHouse = createOpenHouse(rs);
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return openHouse;
	}
	
	public OpenHouse getNextOpenHouse() {
		Statement stmt = null;
		OpenHouse openHouse = null;
		int id = -99;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT oh.id, oh.listing_id, oh.start_datetime, oh.end_datetime " +
					" FROM open_houses oh " +
					" WHERE oh.status = 1" +
					" AND oh.start_datetime >= (CURRENT_TIMESTAMP() - INTERVAL 1 DAY)" +
					" ORDER BY oh.start_datetime LIMIT 1";
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			openHouse = createOpenHouse(rs);
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return openHouse;
	}
	
	public void delete(int id) {
		try {
			String queryString = "DELETE FROM open_houses WHERE id = ?";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			
			ptmt.setInt(1, id);
			
			ptmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
	
	public void create(OpenHouse openHouse) {

		try {
			String queryString = "INSERT into open_houses(listing_id, start_datetime, end_datetime, status) VALUES(?,?,?,?)";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			
			ptmt.setInt(1, openHouse.getListingId());
			ptmt.setTimestamp(2, openHouse.getStartDate());
			ptmt.setTimestamp(3, openHouse.getEndDate());
			ptmt.setInt(4, openHouse.getStatus());

			ptmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
	}
	
	public OpenHouse getLastOpenHouse() {
		Statement stmt = null;
		OpenHouse openHouse = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT oh.listing_id, oh.start_datetime, oh.end_datetime, " +
					"l.house_number, l.compass, l.street_name, l.st_suffix " +
					"FROM open_houses oh " +
					"INNER JOIN listings l ON l.id = oh.listing_id " +
					"ORDER BY l.id DESC " +
					"LIMIT 1";
			ResultSet rs = stmt.executeQuery(sql);
			
			openHouse = createOpenHouse(rs);
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
		
		return openHouse;
	}
	
	public List<OpenHouse> getAllValidOpenHouses() {
		ArrayList<OpenHouse> openHouses = new ArrayList<OpenHouse>();
		Statement stmt = null;

		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT oh.id, oh.listing_id, oh.start_datetime, oh.end_datetime, " +
					"l.house_number, l.compass, l.street_name, l.st_suffix " +
					"FROM open_houses oh " +
					"INNER JOIN listings l ON l.id = oh.listing_id";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				OpenHouse openHouse = createOpenHouse(rs);				
				openHouses.add(openHouse);
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
		
		return openHouses;
	}
	
	private OpenHouse createOpenHouse(ResultSet rs) {
		OpenHouse openHouse = null;
		
		openHouse = new OpenHouse();
		
		try {
			openHouse.setId(rs.getInt("id"));
			openHouse.setListingId(rs.getInt("listing_id"));
			openHouse.setStartDate(rs.getTimestamp("start_datetime"));
			openHouse.setEndDate(rs.getTimestamp("end_datetime"));
			openHouse.setAddress(rs.getString("house_number") + " " + rs.getString("compass") + " " + rs.getString("street_name") + " " + rs.getString("st_suffix"));
		} catch (Exception e) {
			
		}
		
		return openHouse;
	}
	
	private int getId(ResultSet rs) {
		
		try {
			return rs.getInt("listing_id");
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return -99;
	}
}
