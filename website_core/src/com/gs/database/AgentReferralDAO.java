package com.gs.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gs.models.AgentReferral;

public class AgentReferralDAO extends BaseDAO {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	
	public AgentReferralDAO() {}
	
	public void Add(AgentReferral agentReferral) {

		try {
			String queryString = "INSERT into agent_referrals(agent_id, referral_id, comments, created_at) VALUES(?,?,?,?)";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			
			ptmt.setInt(1, agentReferral.getAgentId());
			ptmt.setInt(2, agentReferral.getReferralId());
			ptmt.setString(3, agentReferral.getComments());
			ptmt.setDate(4, agentReferral.getCreatedAt());

			ptmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
