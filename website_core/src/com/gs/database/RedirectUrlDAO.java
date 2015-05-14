package com.gs.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gs.models.RedirectUrl;

public class RedirectUrlDAO extends BaseDAO {
	
	public RedirectUrl load(int id) {
		Statement stmt = null;
		RedirectUrl redirectUrl = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, redirect_url FROM redirect_urls where id = '" + id +"'";
			ResultSet rs = stmt.executeQuery(sql);

			redirectUrl = new RedirectUrl();
			rs.next();
			redirectUrl.setId(rs.getInt("id"));
			redirectUrl.setRedirectUrl(rs.getString("redirect_url"));
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
		
		return redirectUrl;
	}
}
