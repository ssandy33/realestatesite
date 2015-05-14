package com.gs.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gs.models.EmailTemplate;

public class EmailTemplateDAO {
    Connection connection = null;
    PreparedStatement ptmt = null;
    ResultSet resultSet = null;
	
	public EmailTemplateDAO() {}

    private Connection getConnection() throws SQLException {
            Connection conn;
            conn = ConnectionFactory.getInstance().getConnection();
            return conn;
    }
    
    public EmailTemplate getEmailTemplate(int id) {
		Statement stmt = null;
		EmailTemplate emailTemplate = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, html, subject, from_address, page_view FROM email_templates where id = " + id;
			ResultSet rs = stmt.executeQuery(sql);

			emailTemplate = new EmailTemplate();
			rs.next();
			emailTemplate.setId(rs.getInt("id"));
			emailTemplate.setHtml(rs.getString("html"));
			emailTemplate.setSubject(rs.getString("subject"));
			emailTemplate.setFromAddress(rs.getString("from_address"));
			emailTemplate.setPageView(rs.getString("page_view"));
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
		
		return emailTemplate;
    }

}
