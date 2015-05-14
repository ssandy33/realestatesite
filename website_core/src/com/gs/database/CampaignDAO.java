package com.gs.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gs.models.Campaign;

public class CampaignDAO extends BaseDAO {
	
	public Campaign load(int id) {
		Statement stmt = null;
		Campaign campaign = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, name, email_template_id, contact_agent_both, is_tweet, redirect_url_id FROM campaigns where id = '" + id +"'";
			ResultSet rs = stmt.executeQuery(sql);

			campaign = new Campaign();
			rs.next();
			campaign.setId(rs.getInt("id"));
			campaign.setName(rs.getString("name"));
			campaign.setContactAgentBoth(rs.getInt("contact_agent_both"));
			campaign.setEmailTemplateId(rs.getInt("email_template_id"));
			campaign.setRedirectUrlId(rs.getInt("redirect_url_id"));
			campaign.setTweet(rs.getBoolean("is_tweet"));
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
		
		return campaign;
	}

}
