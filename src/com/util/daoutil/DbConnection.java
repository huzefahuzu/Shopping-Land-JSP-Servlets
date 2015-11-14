package com.util.daoutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	private static String userName = "root";
	private static String password = "huzefa52";
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/shopping_expo";

	private DbConnection() {
	}

	private static Connection conn = null;

	public static Connection getConnection() {
		if (conn == null) {
			synchronized (DbConnection.class) {
				if (conn == null) {
					try {
						Class.forName(driver);
						conn = DriverManager.getConnection(url, userName,
								password);
						if (conn != null) {
							System.out.println("Connected to DataBase");
						} else {
							System.out.println("Connction Fail");
						}
					} catch (ClassNotFoundException e) {
						System.out.println("Driver jar is not Loaded");
					} catch (SQLException e) {
						System.out.println("sql Exception....");
					} catch (Exception e) {
						System.out.println("other Exception");
					}
				}

			}
		}
		return conn;
	}
	public static void main(String[] args) {
		getConnection();
	}
}
