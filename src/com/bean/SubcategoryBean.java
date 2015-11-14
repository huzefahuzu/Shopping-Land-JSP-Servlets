package com.bean;

public class SubcategoryBean implements SuperBean {
	private int type_Id;
	private int category_Id;
	private String p_type;
	private String category;
	private int subcategory_Id;
	private String subCategory;

	public String getP_type() {
		return p_type;
	}

	public void setP_type(String p_type) {
		this.p_type = p_type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	SubcategoryBean scb;

	public SubcategoryBean() {
		// TODO Auto-generated constructor stub
		this.type_Id = 0;
		this.category_Id = 0;
		this.p_type = null;
		this.category = null;
		this.subcategory_Id = 0;
		this.subCategory = null;
	}

	public int getType_Id() {
		return type_Id;
	}

	public void setType_Id(int type_Id) {
		this.type_Id = type_Id;
	}

	public int getCategory_Id() {
		return category_Id;
	}

	public void setCategory_Id(int category_Id) {
		this.category_Id = category_Id;
	}

	public int getSubcategory_Id() {
		return subcategory_Id;
	}

	public void setSubcategory_Id(int subcategory_Id) {
		this.subcategory_Id = subcategory_Id;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	
	public SuperBean getBean(Object superBean, String... parameter) {
		// TODO Auto-generated method stub
		scb = (SubcategoryBean) superBean;
		this.scb.setType_Id(Integer.parseInt(parameter[0]));
		this.scb.setCategory_Id(Integer.parseInt(parameter[1]));
		this.setSubCategory(parameter[2]);
		return this.scb;
	}

}
