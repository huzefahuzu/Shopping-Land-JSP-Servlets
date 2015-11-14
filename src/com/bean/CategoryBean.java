package com.bean;

public class CategoryBean implements SuperBean {
	private String typeId;
	private String p_type;
	private String category_id;
	private String category_name;
	public String getTypeId() {
		return typeId;
	}
	
	CategoryBean cb;
	public CategoryBean(){
		this.typeId=null;
		this.p_type=null;
		this.category_id=null;
		this.category_name=null;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}


	public SuperBean getBean(Object superBean, String... parameter) {
		cb=(CategoryBean)superBean;
		//this.cb.setTypeId(parameter[0]);
		//this.cb.setCategory_name(parameter[1]);
		return this.cb;
	}
	
	
	
	
}
