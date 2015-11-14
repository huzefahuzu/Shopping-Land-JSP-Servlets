package com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.util.daoutil.DbConnection;

public class MasterDelete {
	public boolean deleteCheckedItem(String tablename, String tablesid,
			String... deleteChecked) {

		synchronized (this) {
			Connection con = DbConnection.getConnection();
			try {
				Statement stmt = con.createStatement();

				for (int i = 0; i < deleteChecked.length; i++) {
					System.out.println(deleteChecked[i]);
					System.out.println("delete from " + tablename + " where "
							+ tablesid + "=" + deleteChecked[i] + "");
					System.out.println("in master");
					stmt.executeUpdate("delete from " + tablename + " where "
							+ tablesid + "=" + deleteChecked[i] + "");

				}

			} catch (MySQLIntegrityConstraintViolationException e) {
				// TODO: handle exception
				System.out.println("you try to delete foreign key constrains");
				return false;

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return true;
		}

	}
}
