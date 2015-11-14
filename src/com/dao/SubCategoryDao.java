package com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.SubcategoryBean;
import com.util.daoutil.DaoUtil;
import com.util.daoutil.DbConnection;

public class SubCategoryDao {

	// this method for insert data into subcategory tabel.
	public boolean insertSubCategory(SubcategoryBean subCategoryBean,
			boolean vsFlag) {
		return DaoUtil.daoInsert(
				vsFlag,
				"insert into product_subcategory(type_id,category_id,subcategory_name) values("
						+ subCategoryBean.getType_Id() + ","
						+ subCategoryBean.getCategory_Id() + ",'"
						+ subCategoryBean.getSubCategory() + "')");

	}

	// this method for show inserted subCategory data.
	public List<SubcategoryBean> showSubCategoryDataList() {
		List<SubcategoryBean> list = new ArrayList<SubcategoryBean>();
		Connection conn = null;

		CallableStatement st = null;
		ResultSet rs = null;
		try {
			conn = DbConnection.getConnection();
			CallableStatement stmt = conn
					.prepareCall("{CALL  product_subcategoryProcedure()}");
			// String select =
			// "select p_type,  category_name, subcategory_id,  subcategory_name from ((product_type join product_category on (product_type.type_id=product_category.typeId)) join product_subcategory on (product_category.category_id = product_subcategory.category_id))";
			
			rs = stmt.executeQuery();
			System.out.println(" Subcategory Callable Executed..........");
			SubcategoryBean scb;
			while (rs.next()) {
				scb = new SubcategoryBean();
				// scb.setType_Id(rs.getInt("type_id"));
				// scb.setCategory_Id(rs.getInt("category_id"));
				scb.setP_type(rs.getString("p_type"));
				scb.setCategory(rs.getString("category_name"));
				scb.setSubcategory_Id(rs.getInt("subcategory_id"));
				scb.setSubCategory(rs.getString("subcategory_name"));
				list.add(scb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public List<SubcategoryBean> getAllSubcategory(String pCategory) {
		List<SubcategoryBean> subCategoryList = new ArrayList<SubcategoryBean>();
		Connection con = DbConnection.getConnection();
		ResultSet rs = null;
		CallableStatement st = null;
		System.out.println("categoryId= " + pCategory);
		if (con != null) {
			System.out.println(pCategory);
			// String SQL =
			// "SELECT * FROM PRODUCT_SUBCATEGORY WHERE category_id="
			// + pCategory;
			try {
				st = con.prepareCall("{call getAllSubcategoryProcedure(?)}");

				//st.setString(1, "type_id");
				st.setString(1, pCategory);
				// st.setString(3, "subcategory_id");
				// st.setString(4, "subcategory_name");
				rs = st.executeQuery();
				System.out
						.println(" Get all Subcategory Callable Executed..........");
				SubcategoryBean scb;

				while (rs.next()) {
					scb = new SubcategoryBean();
					scb.setSubcategory_Id(rs.getInt("subcategory_id"));
					// scb.setType_Id(rs.getInt("type_id"));
					// scb.setCategory_Id(rs.getInt("category_id"));
					scb.setSubCategory(rs.getString("subcategory_name"));
					subCategoryList.add(scb);
				}

			} catch (SQLException e) {
				System.out.println("query in exception");
			}

		}
		System.out.println(subCategoryList.get(0).getSubcategory_Id());
		return subCategoryList;
	}
}
