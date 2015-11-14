package com.util.daoutil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoUtil {
	public static boolean daoInsert(boolean vsFlag, String insertQuery) {
		Connection conn = null;

		Statement stmt = null;
		if (!vsFlag) {

			conn = DbConnection.getConnection();

			if (conn != null) {

				try {
					stmt = conn.createStatement();

					System.out.println("Insert Query : " + insertQuery);
					int result = stmt.executeUpdate(insertQuery);

					if (result > 0) {

						return true;
					}

				} catch (SQLException e) {
					e.printStackTrace();
					System.out
							.println("Sql Exception is fire Please check Your Query");
				}

			}
		}

		return false;

	}

	public static boolean daoDelete(String deleteQuery) {
		Connection conn = null;

		Statement stmt = null;
		conn = DbConnection.getConnection();
		try {
			stmt = conn.createStatement();
			System.out.println(deleteQuery);
			int res = stmt.executeUpdate(deleteQuery);
			System.out.println(res);
			if (res > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
