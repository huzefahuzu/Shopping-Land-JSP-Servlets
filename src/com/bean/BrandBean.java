package com.bean;

public class BrandBean{
	private int brandId;
	private int typeId;
	private int categoryId;
	private int subCategoryId;
	private String p_type;
	private String category_name;
	private String subcategory_name;
	private String brandName;
	private String brandIcon;

	//BrandBean bb = new BrandBean();

	public BrandBean() {
		// TODO Auto-generated constructor stub
		brandId = 0;
		typeId = 0;
		categoryId = 0;
		subCategoryId = 0;
		p_type=null;
		category_name=null;
		subcategory_name=null;
		brandName = null;
		brandIcon = null;
	}

	public String getP_type() {
		return p_type;
	}

	public void setP_type(String p_type) {
		this.p_type = p_type;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getSubcategory_name() {
		return subcategory_name;
	}

	public void setSubcategory_name(String subcategory_name) {
		this.subcategory_name = subcategory_name;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandIcon() {
		return brandIcon;
	}

	public void setBrandIcon(String brandIcon) {
		this.brandIcon = brandIcon;
	}


}
