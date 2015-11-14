package com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.CityBean;
import com.util.daoutil.DaoUtil;
import com.util.daoutil.DbConnection;

public class CityDao {
	public boolean insert_city(CityBean bean, boolean vsFlag) {
		return DaoUtil.daoInsert(
				vsFlag,
				"insert into city(stateId,countryId,cityName) values("
						+ bean.getStateId() + "," + bean.getCountryId() + ",'"
						+ bean.getCityName() + "')");
	}

	public List cityList() {
		List<CityBean> list = new ArrayList<CityBean>();
		Connection conn = null;

		CallableStatement  stmt = null;
		ResultSet rs = null;
		try {
			conn = DbConnection.getConnection();
			stmt = conn.prepareCall("{CALL  cityProcedure()}");
		//	String select = "select countryId,stateId,cityId,cityname FROM city";
				
			rs = stmt.executeQuery();
			CityBean cb;
			while (rs.next()) {
				cb = new CityBean();
				cb.setCountryId(rs.getInt("country_id"));
				cb.setStateId(rs.getInt("state_id"));
				cb.setCityId(rs.getInt("city_id"));
				cb.setCityName(rs.getString("cityName"));
				list.add(cb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	
	public List<CityBean> getAllCities(String stateId) {
		List<CityBean> cityList = new ArrayList<CityBean>();
		Connection con = DbConnection.getConnection();
		ResultSet rs = null;
		CallableStatement st = null;
		if (con != null) {

//			String SQL = "SELECT * FROM city WHERE stateId=" + stateId;
			try {

				st = con.prepareCall("{CALL  getAllCityProcedure(?)}");
				st.setString(1, "state_id");
				rs = st.executeQuery();
				CityBean city;

				while (rs.next()) {
					city = new CityBean();
					city.setCountryId(rs.getInt("country_id"));
					city.setStateId(rs.getInt("state_id"));
					city.setCityId(rs.getInt("city_id"));
					city.setCityName(rs.getString("cityName"));
					cityList.add(city);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return cityList;
	}
}
