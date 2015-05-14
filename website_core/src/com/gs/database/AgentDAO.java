package com.gs.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gs.models.Agent;

public class AgentDAO extends BaseDAO {

	public AgentDAO(){}
	
	public void updateAgent(Agent agent) {
		Statement stmt = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			
			String sql = "UPDATE agents set first_name = '" + agent.getFirstName() + "', last_name = '" + agent.getLastName() 
					+ "', email = '" + agent.getEmail() + "', cell_1 = '" + agent.getCell1() + "', cell_2 = '" + agent.getCell2()
					+ "', cell_3 = '" + agent.getCell3() + "' where id = " + agent.getId();
			
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
	
	public void unsubscribe(Agent agent) {
		Statement stmt = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			
			String sql = "UPDATE agents set no_mail = 1 where id = " + agent.getId();
			
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
	
	public Agent loadByGuid(String guid) {
		Statement stmt = null;
		Agent agent = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, first_name, last_name, email, cell_1, cell_2, cell_3, guid FROM agents where guid = '" + guid +"'";
			ResultSet rs = stmt.executeQuery(sql);

			agent = new Agent();
			rs.next();
			agent.setId(rs.getInt("id"));
			agent.setFirstName(rs.getString("first_name"));
			agent.setLastName(rs.getString("last_name"));
			agent.setEmail(rs.getString("email"));
			agent.setCell1(rs.getString("cell_1"));
			agent.setCell2(rs.getString("cell_2"));
			agent.setCell3(rs.getString("cell_3"));
			agent.setGuid(rs.getString("guid"));
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
		
		return agent;
	}
}
