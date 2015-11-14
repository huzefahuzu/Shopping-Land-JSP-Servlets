package com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.SizeBean;
import com.bean.StateBean;
import com.util.daoutil.DaoUtil;
import com.util.daoutil.DbConnection;

public class SizeDao {
	public boolean insertSize(boolean vsFlag, SizeBean sb) {
		return DaoUtil.daoInsert(
				vsFlag,
				"insert into size (categoryId,size) values('"
						+ sb.getCategoryId() + "','" + sb.getSize() + "')");
	}

	public List<SizeBean> showSizeList() {
		List<SizeBean> list = new ArrayList<SizeBean>();
		Connection conn = null;

		CallableStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbConnection.getConnection();
			stmt = conn.prepareCall("{call sizeProcedure()");
			
			// String select = "select sizeId,categoryId,size FROM size";
			rs = stmt
					.executeQuery();
			SizeBean sb;
			while (rs.next()) {
				sb = new SizeBean();
				sb.setCategoryId(rs.getString("category_id"));
				sb.setSizeId(rs.getString("size_id"));
				sb.setSize(rs.getString("size"));
				list.add(sb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
}
