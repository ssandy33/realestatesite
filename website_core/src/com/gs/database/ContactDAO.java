package com.gs.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gs.models.Contact;

public class ContactDAO extends BaseDAO {

	private static ContactDAO ref;
	
	private ContactDAO() {}
	
	public static synchronized ContactDAO getContactDAOSingleton() {
		if (ref == null)
			ref = new ContactDAO();
		return ref;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public boolean Add(Contact contact) {

		try {
			String queryString = "INSERT INTO contacts(first_name, last_name, email, address, suite, city, state, zip_code, phone_1, phone_2, phone_3, "
					+ " cell_1, cell_2, cell_3, bedroom, bath, min_price, max_price, no_mail, acquisition_method_id) "
					+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);

			ptmt.setString(1, contact.getFirstName());
			ptmt.setString(2, contact.getLastName());
			ptmt.setString(3, contact.getEmail());
			ptmt.setString(4, contact.getAddress());
			ptmt.setString(5, contact.getSuite());
			ptmt.setString(6, contact.getCity());
			ptmt.setString(7, contact.getState());
			ptmt.setString(8, contact.getZipCode());
			ptmt.setString(9, contact.getPhone1());
			ptmt.setString(10, contact.getPhone2());
			ptmt.setString(11, contact.getPhone3());
			ptmt.setString(12, contact.getCell1());
			ptmt.setString(13, contact.getCell2());
			ptmt.setString(14, contact.getCell3());
			ptmt.setInt(15, contact.getBedroom());
			ptmt.setInt(16, contact.getBath());
			ptmt.setString(17, contact.getMinPrice());
			ptmt.setString(18, contact.getMaxPrice());
			ptmt.setInt(19, contact.getNoMail());
			ptmt.setInt(20, contact.getAcquisitionMethodId());

			ptmt.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
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
	
	public Contact loadByGuid(String guid) {
		Statement stmt = null;
		Contact contact = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, first_name, last_name, email, cell_1, cell_2, cell_3, guid FROM contacts where guid = '" + guid +"'";
			ResultSet rs = stmt.executeQuery(sql);

			contact = new Contact();
			rs.next();
			contact.setId(rs.getInt("id"));
			contact.setFirstName(rs.getString("first_name"));
			contact.setLastName(rs.getString("last_name"));
			contact.setEmail(rs.getString("email"));
			contact.setCell1(rs.getString("cell_1"));
			contact.setCell2(rs.getString("cell_2"));
			contact.setCell3(rs.getString("cell_3"));
			contact.setGuid(rs.getString("guid"));
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
		
		return contact;
	}

}
