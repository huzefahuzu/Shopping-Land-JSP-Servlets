package com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.StateBean;
import com.util.daoutil.DaoUtil;
import com.util.daoutil.DbConnection;

public class StateDao {
	public boolean insertState(boolean vsFlag, StateBean sb) {
		return DaoUtil.daoInsert(
				vsFlag,
				"insert into state(country_id,state) value('"
						+ sb.getCountryId() + "','" + sb.getStateName() + "')");
	}

	public List<StateBean> showStateDataList() {
		List<StateBean> list = new ArrayList<StateBean>();
		Connection conn = null;

		CallableStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbConnection.getConnection();
			stmt = conn.prepareCall("{call stateProcedure()}");
			// String select = "select state_id,state FROM state";
			
			rs = stmt.executeQuery();
			System.out.println("State  Callable Executed..........");
			StateBean sb;
			while (rs.next()) {
				sb = new StateBean();
				sb.setStateId(rs.getInt("state_id"));
				sb.setStateName(rs.getString("state"));
				list.add(sb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public List<StateBean> getAllStates(String country_id) {
		List<StateBean> stateList = new ArrayList<StateBean>();
		Connection con = DbConnection.getConnection();
		ResultSet rs = null;
		CallableStatement st = null;
		if (con != null) {

//			String SQL = "SELECT * FROM STATE WHERE COUNTRY_ID=" + countryId;
			try {

				st = con.prepareCall("{CALL  getCountryProcedure(?)}");
			 	st.setString(1, country_id);
				rs = st.executeQuery();
//				st.setString(1, "state_id");
//				st.setString(2, "state");
		  
				
				StateBean state;

				while (rs.next()) {
					state = new StateBean();
					state.setStateId(rs.getInt("state_id"));
					state.setStateName(rs.getString("state"));
					state.setCountryId(rs.getInt("country_id"));
					stateList.add(state);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return stateList;
	}

}
