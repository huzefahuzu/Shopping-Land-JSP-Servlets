package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.AdminBean;
import com.bean.AdminLoginBean;
import com.util.daoutil.DaoUtil;
import com.util.daoutil.DbConnection;

public class AdminLoginDAO {

	public AdminLoginBean login(String userName, String password) {

		Connection conn = DbConnection.getConnection();
		Statement pstmt = null;
		ResultSet rs = null;
		AdminLoginBean alb = null;
		try {
			pstmt = conn.createStatement();
			String select = "select username from admin_info where userName='"
					+ userName + "' and password='" + password + "'";
			System.out.println(select);
			rs = pstmt.executeQuery(select);

			while (rs.next()) {
				alb = new AdminLoginBean();
				alb.setAdminUser(rs.getString("username"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(alb);
		return alb;
	}

	public boolean insertAdmin(boolean vsFlag, AdminBean ab) {
		return DaoUtil
				.daoInsert(
						vsFlag,
						"insert into admin_info(firstName,middelName,lastName,userName,password,dob,gender,country,state,city,mobile,address,Exp,is_Available) values('"
								+ ab.getFirstName()
								+ "','"
								+ ab.getMiddelName()
								+ "','"
								+ ab.getLastName()
								+ "','"
								+ ab.getEmail()
								+ "','"
								+ ab.getPassword()
								+ "','"
								+ ab.getDob()
								+ "','"
								+ ab.getGender()
								+ "','"
								+ ab.getCountry()
								+ "','"
								+ ab.getState()
								+ "','"
								+ ab.getCity()
								+ "','"
								+ ab.getMobile()
								+ "','"
								+ ab.getAddress()
								+ "','"
								+ ab.getExp()
								+ "'," + ab.getIsAvailable() + ")");
	}

	public List<AdminBean> showAdminList() {

		Connection conn = DbConnection.getConnection();
		Statement pstmt = null;
		ResultSet rs = null;
		List<AdminBean> albl = new ArrayList<AdminBean>();
		AdminBean alb = null;
		try {
			pstmt = conn.createStatement();
			String select = "select * from admin_info";

			rs = pstmt.executeQuery(select);

			while (rs.next()) {
				alb = new AdminBean();
				alb.setAdminId(rs.getString("adminId"));
				alb.setFirstName(rs.getString("firstName"));
				alb.setMiddelName(rs.getString("middelName"));
				alb.setLastName(rs.getString("lastName"));
				alb.setEmail(rs.getString("userName"));
				alb.setPassword(rs.getString("password"));
				alb.setDob(rs.getString("dob"));
				alb.setGender(rs.getString("gender"));
				alb.setCountry(rs.getString("country"));
				alb.setState(rs.getString("state"));
				alb.setCity(rs.getString("city"));
				alb.setMobile(rs.getString("mobile"));
				alb.setAddress(rs.getString("address"));
				alb.setExp(rs.getString("exp"));
				alb.setIsAvailable(rs.getInt("is_Available"));
				alb.setIsApproved(rs.getInt("is_Approved"));
				albl.add(alb);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return albl;
	}

}
