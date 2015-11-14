package com.util.listutil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.daoutil.DbConnection;

public class DashBoardLists {
	public static void Product_TypeList(HttpServletRequest request,
			HttpServletResponse response, int i, String attribute)
			throws ServletException, IOException {

		if (i>0) {
			System.out.println("list is not null");
			request.setAttribute(attribute, i);
			
		} else {
			System.out.println("list is null please insert a data");
		}

	}

	public int list(String tableName) {
		Connection conn = null;
		int i = 0;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbConnection.getConnection();
			stmt = conn.createStatement();
			String select = "select * from " + tableName;
			rs = stmt.executeQuery(select);

			while (rs.next()) {
				i += 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}
}
