package com.gs.database;

import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import com.gs.models.Agent;
import com.gs.models.Contact;

public class ContactDAO extends BaseDAO {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;

	public ContactDAO() {
	}
	
	public void add(Contact contact) {

		try {
			String queryString = "INSERT INTO contacts(first_name, last_name, email, address, suite, city, state, zip_code, phone_1, phone_2, phone_3,"
					+ " cell_1, cell_2, cell_3, bedroom, bath, min_price, max_price, no_mail) "
					+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
	
	public List getContactsWhoWantEmails() {
		Statement stmt = null;
		Contact contact = null;
		List<Contact> contacts = new ArrayList<Contact>();
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, first_name, last_name, email, no_mail, guid FROM contacts WHERE no_mail = 0 and id > 297";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				contact = new Contact(rs);		
				contacts.add(contact);
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
		
		return contacts;
		
	}
	
	public List getAllContacts() {
		Statement stmt = null;
		Contact contact = null;
		List<Contact> contacts = new ArrayList<Contact>();
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, first_name, last_name, email, no_mail FROM contacts WHERE id not in (197)";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				contact = new Contact(rs);		
				contacts.add(contact);
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
		
		return contacts;
		
	}

	public void updateContactGuid(Contact contact) {
		Statement stmt = null;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			
			String sql = "UPDATE contacts set guid = '" + URLEncoder.encode(UUID.randomUUID().toString(), "UTf8") + "' where id = " + contact.getId();
			
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

	public void updateContactGuid() {
		Statement stmt = null;
		List<Contact> contacts = new ArrayList<Contact>();
		Iterator<Contact> it;
		Contact contact = null;
		
		contacts = getAllContacts();
		it = contacts.iterator();
		
		try {
			connection = getConnection();
			while (it.hasNext()) {
				contact = it.next();
				stmt = connection.createStatement();
				
				String sql = "UPDATE contacts_test set guid = '" + URLEncoder.encode(UUID.randomUUID().toString(), "UTf8") + "' where id = " + contact.getId();
				
				stmt.executeUpdate(sql);
				}
			
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

	public void updateNoMailAndEmail(Contact contact) {
		Statement stmt = null;
		
		try {
				connection = getConnection();
				stmt = connection.createStatement();
				
				String sql = "UPDATE contacts set email = null, no_mail = 1 where id = " + contact.getId();
				
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

}
