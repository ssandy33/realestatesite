package com.gs.database;

import java.sql.SQLException;

import com.gs.models.CampaignHit;

public class CampaignHitDAO extends BaseDAO {

	
	public void save(CampaignHit campaignHit) {
    	try {
    		String queryString = "INSERT INTO campaign_hits (campaign_id, contact_id, agent_id, created_at, time) VALUES(?,?,?,?,?)";

            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);

            ptmt.setInt(1, campaignHit.getCampaignId());
            ptmt.setInt(2, campaignHit.getContactId());
            ptmt.setInt(3, campaignHit.getAgentId());
            ptmt.setDate(4, campaignHit.getCreatedAt());
            ptmt.setTime(5, campaignHit.getTime());
               
            ptmt.executeUpdate();
    	} catch (SQLException e) {
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
