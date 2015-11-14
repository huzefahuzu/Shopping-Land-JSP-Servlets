package com.bean;

public class AdminLoginBean {

	private String id;
	private String adminUser;
	private String adminPassword;

	public AdminLoginBean() {
		this.id = null;
		this.adminUser = null;
		this.adminPassword = null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdminUser() {
		return adminUser;
	}

	public void setAdminUser(String adminUser) {
		this.adminUser = adminUser;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

}
