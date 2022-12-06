package com.moaaz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnection {

	protected Connection connection;
	protected PreparedStatement s;
	protected String sql;
	protected ResultSet result;

	/*******************/
//	private String host = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12563437";
//	private String user = "sql12563437";
//	private String password = "jRXPXwpNc6";

	/**********************/
	private String host = "jdbc:mysql://localhost:3306/rawanghanemweb";
//	private String host = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9544188";
	private String user = "root";
//	private String user = "sql9544188";
	private String password = "";
//	private String password = "kLsr8DUfWn";

	protected Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(host, user, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return connection;
	}

//	protected void closeConnectionWithResult(Connection connection, PreparedStatement s, ResultSet res)
//			throws SQLException {
//		connection.close();
//		s.close();
//		res.close();
//	}
//
//	protected void closeConnection(Connection connection, PreparedStatement s) throws SQLException {
//		connection.close();
//		s.close();
//	}
}
