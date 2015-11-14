package com.bean;

public class SizeBean implements SuperBean {
	private String sizeId;
	private String size;
	private String categoryId;

	public SizeBean() {
		// TODO Auto-generated constructor stub
		sizeId = null;
		size = null;
		categoryId = null;
	}

	SizeBean sb;

	public String getSizeId() {
		return sizeId;
	}

	public void setSizeId(String sizeId) {
		this.sizeId = sizeId;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}


	public SuperBean getBean(Object superBean, String... parameter) {
		// TODO Auto-generated method stub
		sb = (SizeBean) superBean;
		sb.setCategoryId(parameter[0]);
		sb.setSize(parameter[1]);
		return null;
	}

}
