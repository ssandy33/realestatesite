package com.gs.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gs.models.PriceRange;

public class PriceRangeDAO extends BaseDAO {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	
	public PriceRangeDAO() {
		super();
	}
	
	public List getMaxPriceRangesAsSelectOptions() {
		ArrayList maxes = new ArrayList();
		Statement stmt = null;
		PriceRange max = null;

		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, value, label FROM price_ranges where id > 1 order by id";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				max = new PriceRange();
				max.setId(rs.getInt("id"));
				max.setValue(rs.getInt("value"));
				max.setLabel(rs.getString("label"));
				
				maxes.add(max);
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
		
		return maxes;
	}
	
	public List getMinPriceRangesAsSelectOptions() {
		ArrayList mins = new ArrayList();
		Statement stmt = null;
		PriceRange min = null;

		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, value, label FROM price_ranges where id < 10 order by id";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				min = new PriceRange();
				min.setId(rs.getInt("id"));
				min.setValue(rs.getInt("value"));
				min.setLabel(rs.getString("label"));
				
				mins.add(min);
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
		
		return mins;
	}

}
