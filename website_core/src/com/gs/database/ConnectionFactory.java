package com.gs.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
        String driverClassName = "com.mysql.jdbc.Driver";
//        String connectionUrl = "jdbc:mysql://localhost:3306/website";
//        String dbUser = "root";
//        String dbPwd = "passw0rd";
        String connectionUrl = "jdbc:mysql://gabbysandy.4java.ca:3306/website";
        String dbUser = "ssandy";
        String dbPwd = "p@ssw0rd";

        private static ConnectionFactory connectionFactory = null;

        private ConnectionFactory() {
                try {
                        Class.forName(driverClassName);
                } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                }
        }

        public Connection getConnection() throws SQLException {
                Connection conn = null;
                conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
                return conn;
        }

        public static ConnectionFactory getInstance() {
                if (connectionFactory == null) {
                        connectionFactory = new ConnectionFactory();
                }
                return connectionFactory;
        }
}
