package com.gs.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gs.models.SearchArea;

public class SearchAreaDAO extends BaseDAO {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;

	public SearchAreaDAO() {}
	
	public SearchArea getSearchArea(int id) {
		Statement stmt = null;
		SearchArea area = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, name FROM search_areas where id = " + id;
			ResultSet rs = stmt.executeQuery(sql);

			area = new SearchArea();
			rs.next();
			area.setId(rs.getInt("id"));
			area.setName(rs.getString("name"));
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
		
		return area;
	}
	
	public List getAllSearchAreas() {
		ArrayList areas = new ArrayList();
		Statement stmt = null;
		SearchArea area = null;

		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, name FROM search_areas";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				area = new SearchArea();
				area.setId(rs.getInt("id"));
				area.setName(rs.getString("name"));
				
				areas.add(area);
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
		
		return areas;
	}
}
