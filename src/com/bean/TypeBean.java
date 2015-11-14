package com.bean;

public class TypeBean implements SuperBean {
	private String pType_Id;
	private String pType;
	TypeBean lb;

	public TypeBean() {

		this.pType = null;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public TypeBean getBean(Object lb, String... parameter) {
		// TODO Auto-generated method stub

		this.lb = ((TypeBean) lb);
		this.lb.setpType(parameter[0]);
		// System.out.println(lb.getpType());
		return this.lb;

	}

	public String getpType_Id() {
		return pType_Id;
	}

	public void setpType_Id(String pType_Id) {
		this.pType_Id = pType_Id;
	}

}
