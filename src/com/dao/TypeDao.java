package com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.TypeBean;
import com.util.daoutil.DaoUtil;
import com.util.daoutil.DbConnection;

public class TypeDao {

	TypeBean lb;

	public boolean insertType(TypeBean lb, boolean vsFlag) {
		return DaoUtil.daoInsert(vsFlag,
				"insert into product_type(p_type)values('" + lb.getpType()
						+ "')");
	}

	public List<TypeBean> list() {
		List<TypeBean> list = new ArrayList<TypeBean>();
		Connection conn = null;

		CallableStatement  stmt = null;
		ResultSet rs = null;
		try {
			conn = DbConnection.getConnection();
			stmt = conn.prepareCall("{CALL  getAllTypeProcedure()}");

		//	String select = "select * from product_type";
		
		rs = stmt.executeQuery();

			
			while (rs.next()) {
				lb = new TypeBean();
				lb.setpType_Id(rs.getString("TYPE_ID"));
				lb.setpType(rs.getString("P_TYPE"));
				list.add(lb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception :"+e.getMessage()+e.getErrorCode() );
			e.printStackTrace();
		}

		return list;
	}

	public boolean delete(TypeBean lb) {
		return DaoUtil.daoDelete("{call deleteType(?)}" + lb.getpType_Id());
	}

	public List<TypeBean> TypeList() {
		List<TypeBean> list = new ArrayList<TypeBean>();
		Connection conn = null;

		CallableStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbConnection.getConnection();
			stmt = conn.prepareCall("{call product_type()}");
			// String select = "select type_id,p_type FROM product_type";
//			stmt.setString(1, "type_id");
//			stmt.setString(2, "p_type");
			// .executeQuery("CREATE PROCEDURE shopping_expo.product_type(IN type_id INT , IN p_type nvarchar(30)) BEGIN	select type_id,p_type FROM product_type;END;");
			System.out.println("Type Callable Executed");
			rs = stmt.executeQuery();
			while (rs.next()) {
				lb = new TypeBean();
				lb.setpType_Id(rs.getString("TYPE_ID"));
				lb.setpType(rs.getString("P_TYPE"));
				list.add(lb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
}
