package com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.CategoryBean;
import com.util.daoutil.DaoUtil;
import com.util.daoutil.DbConnection;

public class CategoryDao {

	public boolean insert_category(CategoryBean bean, boolean vsFlag) {
		return DaoUtil.daoInsert(vsFlag,
				"insert into product_category(typeId,category_name) values('"
						+ bean.getTypeId() + "','" + bean.getCategory_name()
						+ "')");
	}

	public List<CategoryBean> Product_CategoryList() {
		List<CategoryBean> list = new ArrayList<CategoryBean>();
		Connection conn = null;

		CallableStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbConnection.getConnection();
			stmt = conn.prepareCall("{call product_categoryProcedure()}");
			// String select =
			// "select p_type, category_id, category_name from (product_type join product_category on (product_type.type_id=product_category.typeId))";
			
			rs = stmt.executeQuery();
			System.out.println("  Category Callable Executed..........");
			CategoryBean cb;

			while (rs.next()) {
				cb = new CategoryBean();
				cb.setP_type(rs.getString("p_type"));
				cb.setCategory_id(rs.getString("category_id"));
				cb.setCategory_name(rs.getString("category_name"));
				list.add(cb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public List<CategoryBean> getAllCategory(String type_id) {
		List<CategoryBean> categoryList = new ArrayList<CategoryBean>();
		Connection con = DbConnection.getConnection();
		ResultSet rs = null;
		CallableStatement st = null;
		if (con != null) {
			System.out.println(type_id);
			// String SQL = "SELECT * FROM PRODUCT_CATEGORY WHERE typeid="
			// + typeId;

			try {

				st = con.prepareCall("{CALL getAllCategory(?)}");
				st.setString(1, type_id);
		//		st.setString(2, "category_id");
		//		st.setString(3, "category_name");
				rs = st.executeQuery();
				System.out.println("Get all  Category Callable Executed..........");
				CategoryBean category;
				while (rs.next()) {
					category = new CategoryBean();
					category.setTypeId(rs.getString("type_id"));
					category.setCategory_id(rs.getString("category_id"));
					category.setCategory_name(rs.getString("category_name"));
					categoryList.add(category);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		System.out.println(categoryList);
		return categoryList;
	}
}
