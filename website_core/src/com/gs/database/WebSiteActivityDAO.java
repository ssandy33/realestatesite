package com.gs.database;

import java.sql.SQLException;

import com.gs.models.Contact;
import com.gs.models.WebSiteActivity;

public class WebSiteActivityDAO extends BaseDAO {
	
	private static WebSiteActivityDAO ref;
	
	private WebSiteActivityDAO(){}
	
	public static synchronized WebSiteActivityDAO getWebSiteActivityDAOSingleton() {
		if (ref == null)
			ref = new WebSiteActivityDAO();
		return ref;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public boolean Add(WebSiteActivity webSiteActivity) {

		try {
			String queryString = "INSERT INTO web_site_activity(visited_at, zillow_referer) VALUES(?,?)";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);

			ptmt.setTimestamp(1,webSiteActivity.getVisitedAt());
			ptmt.setInt(2, webSiteActivity.getZillowReferer());

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

}