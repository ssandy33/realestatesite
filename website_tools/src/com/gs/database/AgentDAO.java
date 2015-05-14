package com.gs.database;

import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gs.models.Agent;

public class AgentDAO extends BaseDAO {
	
	public AgentDAO() {}
	
	public List getAgentsWhoWantEmails() {
		Statement stmt = null;
		Agent agent = null;
		List<Agent> agents = new ArrayList<Agent>();
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, first_name, last_name, email, no_mail FROM agents WHERE no_mail = 0";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				agent = new Agent(rs);		
				agents.add(agent);
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
		
		return agents;
		
	}

	public void updateAgentGuid(Agent agent) {
		Statement stmt = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			
			String sql = "UPDATE agents set guid = '" + URLEncoder.encode(agent.getGuid(), "UTf8") + "' where id = " + agent.getId();
			
			stmt.executeUpdate(sql);
			
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
	
	public void save(Agent agent) {
    	try {
    		String queryString = "INSERT INTO agents (first_name, last_name, middle_name, full_name, email, office_name, address, address2, suite, city, state, zip_code, phone_1, phone_2," +
    				"phone_3, cell_1, cell_2, cell_3, fax_1, fax_2, fax_3, agent_type_id, no_mail, test_account) " + 
    				" VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);

            ptmt.setString(1, agent.getFirstName());
            ptmt.setString(2, agent.getLastName());
            ptmt.setString(3, agent.getMiddleName());
            ptmt.setString(4, agent.getFullName());
            ptmt.setString(5, agent.getEmail());
            ptmt.setString(6, agent.getOfficeName());
            ptmt.setString(7, agent.getAddress());
            ptmt.setString(8, agent.getAddress2());
            ptmt.setString(9, agent.getSuite());
            ptmt.setString(10, agent.getCity());
            ptmt.setString(11, agent.getState());
            ptmt.setString(12, agent.getZipCode());
            ptmt.setString(13, agent.getPhone1());
            ptmt.setString(14, agent.getPhone2());
            ptmt.setString(15, agent.getPhone3());
            ptmt.setString(16, agent.getCell1());
            ptmt.setString(17, agent.getCell2());
            ptmt.setString(18, agent.getCell3());
            ptmt.setString(19, agent.getFax1());
            ptmt.setString(20, agent.getFax2());
            ptmt.setString(21, agent.getFax3());
            ptmt.setInt(22, agent.getAgentType());
            ptmt.setBoolean(23, agent.isNoMail());
            ptmt.setBoolean(24, agent.isTestAccount());
            
            
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
