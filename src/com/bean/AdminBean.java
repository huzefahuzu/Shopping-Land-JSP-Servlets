package com.bean;

public class AdminBean implements SuperBean {

	private String adminId;
	private String firstName;
	private String middelName;
	private String lastName;
	private String email;
	private String password;
	private String dob;
	private String gender;
	private String country;
	private String state;
	private String city;
	private String mobile;
	private String address;
	private String exp;
	private int isAvailable;
	private int isApproved;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		adminId = adminId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddelName() {
		return middelName;
	}

	public void setMiddelName(String middelName) {
		this.middelName = middelName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public int getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(int isAvailable) {
		this.isAvailable = isAvailable;
	}

	AdminBean ab;

	public SuperBean getBean(Object superBean, String... parameter) {
		ab = (AdminBean) superBean;
		ab.setFirstName(parameter[0]);
		ab.setMiddelName(parameter[1]);
		ab.setLastName(parameter[2]);
		ab.setEmail(parameter[3]);
		ab.setPassword(parameter[4]);
		ab.setDob(parameter[5]);
		ab.setGender(parameter[6]);
		ab.setCountry(parameter[7]);
		ab.setState(parameter[8]);
		ab.setCity(parameter[9]);
		ab.setMobile(parameter[10]);
		ab.setAddress(parameter[11]);
		ab.setExp(parameter[12]);
		ab.setIsAvailable(Integer.parseInt(parameter[13]));
		return ab;
	}

	public int getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(int isApproved) {
		this.isApproved = isApproved;
	}

}
