package com.gs.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gs.models.EmailTouch;

public class EmailTouchDAO extends BaseDAO {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	
	public void Add(EmailTouch emailTouch) {
		try {
			String queryString = "INSERT into email_touches(agent_id, email_template_id, email_sent_at) VALUES(?,?,?)";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			
			ptmt.setInt(1, emailTouch.getAgentId());
			ptmt.setInt(2, emailTouch.getEmailTemplateId());
			ptmt.setDate(3, new Date(System.currentTimeMillis()));
			
			ptmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
