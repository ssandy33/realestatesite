package com.gs.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gs.models.CsvMlsListingsSummary;

public class CsvMlsListingsSummaryDAO {
    Connection connection = null;
    PreparedStatement ptmt = null;
    ResultSet resultSet = null;
    
    public CsvMlsListingsSummaryDAO() {}

    private Connection getConnection() throws SQLException {
            Connection conn;
            conn = ConnectionFactory.getInstance().getConnection();
            return conn;
    }
    
	public String getSummaryTableToUse() {
		Statement stmt = null;
		CsvMlsListingsSummary mlsListingSummary = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT date_updated, table_to_use FROM csv_mls_listings_summary";
			ResultSet rs = stmt.executeQuery(sql);

			mlsListingSummary = new CsvMlsListingsSummary();
			rs.next();
			mlsListingSummary.setDateUpdated(rs.getDate("date_updated"));
			mlsListingSummary.setTableToUse(rs.getString("table_to_use"));
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
		
		return mlsListingSummary.getTableToUse();
	}
	
	public void updateSummaryTableToUse() {
		String newSummaryTable = "2";
		Statement stmt = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			
			if ("1".equals(getSummaryTableToUse()))
				newSummaryTable = "2";
			else
				newSummaryTable = "1";
			
			String sql = "UPDATE csv_mls_listings_summary set table_to_use = " + newSummaryTable + ", date_updated = NOW()";
			
			stmt.executeQuery(sql);
			
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
	}

}
