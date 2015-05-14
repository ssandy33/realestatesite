package com.gs.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gs.models.Agent;
import com.gs.models.State;

public class StateDAO extends BaseDAO {
	
	public List getStates() {
		Statement stmt = null;
		State state = null;
		List<State> states = new ArrayList<State>();
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, name, abbreviation, country_id FROM states";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				state = new State(rs);		
				states.add(state);
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
		
		return states;
	}

}
