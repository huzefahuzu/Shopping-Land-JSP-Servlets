package com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.directwebremoting.extend.Call;

import com.bean.CategoryBean;
import com.bean.CountryBean;
import com.util.daoutil.DaoUtil;
import com.util.daoutil.DbConnection;

public class CountryAddDao {

	public boolean addCountry(CountryBean cb, boolean vsFlag) {
		return DaoUtil.daoInsert(vsFlag, "insert into country(country)values('"
				+ cb.getCountry_name() + "')");
	}

	public List contryList() {
		List<CountryBean> list = new ArrayList<CountryBean>();
		Connection conn = null;

		CallableStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbConnection.getConnection();
			stmt = conn.prepareCall("{CALL  countryProcedure()}");
		//	String select = "select country_id,country FROM country";
			
			rs = stmt.executeQuery();
			System.out.println("Country  Callable Executed..........");
			CountryBean cb;
			while (rs.next()) {
				cb = new CountryBean();
				cb.setCountry_id(rs.getString("country_id"));
				cb.setCountry_name(rs.getString("country"));
				list.add(cb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
