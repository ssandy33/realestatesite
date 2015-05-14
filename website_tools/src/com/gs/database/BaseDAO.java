package com.gs.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDAO {
    protected Connection connection = null;
    protected PreparedStatement ptmt = null;
    protected ResultSet resultSet = null;

	public BaseDAO() {}
	
    protected Connection getConnection() throws SQLException {
            Connection conn;
            conn = ConnectionFactory.getInstance().getConnection();
            return conn;
    }
}
