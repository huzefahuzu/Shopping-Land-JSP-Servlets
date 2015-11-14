package com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.BrandBean;
import com.bean.SubcategoryBean;
import com.util.daoutil.DaoUtil;
import com.util.daoutil.DbConnection;

public class brandDao {
	public boolean insertBrand(BrandBean bb) {

		System.out.println(bb.getTypeId() + "" + bb.getCategoryId() + ""
				+ bb.getSubCategoryId());
		return DaoUtil
				.daoInsert(
						false,
						"insert into brand(typeId,categoryId,subcategoryId,brandName,brandIcon) values("
								+ bb.getTypeId()
								+ ","
								+ bb.getCategoryId()
								+ ","
								+ bb.getSubCategoryId()
								+ ",'"
								+ bb.getBrandName()
								+ "','"
								+ bb.getBrandIcon()
								+ "')");
	}

	public List<BrandBean> showBrandList() {
		List<BrandBean> list = new ArrayList<BrandBean>();
		Connection conn = null;

		CallableStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbConnection.getConnection();
			stmt = conn.prepareCall("{call brandProcedure()}");
			// String select =
			// "select p_type, brandId,brandIcon,category_name,subcategory_name,brandName from product_type join product_category on (product_type.type_id = product_category.typeId) join product_subcategory on (product_category.category_id = product_subcategory.category_id) join brand on  (product_subcategory.subcategory_id = brand.subcategoryId)";
			rs = stmt.executeQuery();
			System.out.println("Brand  Callable Executed..........");
			BrandBean bb;
			while (rs.next()) {
				bb = new BrandBean();
				bb.setBrandId(rs.getInt("brand_id"));
				bb.setP_type(rs.getString("p_type"));
				bb.setCategory_name(rs.getString("category_name"));
				bb.setSubcategory_name(rs.getString("subcategory_name"));
				bb.setBrandName(rs.getString("brandName"));
				bb.setBrandIcon(rs.getString("brandIcon"));
				list.add(bb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
}
