package com.cisco.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JdbcUtil {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(Driver.class.getName()); // forName("com.mysql.cj.jdbc.Driver")
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/cisco_db", "root", "root");
		return connection;
	}
}
