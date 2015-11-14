package com.bean;

public class CountryBean implements SuperBean {
	private String country_name;
	private String country_id;
	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	CountryBean cb;

	public CountryBean() {
		this.country_name = null;

	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	
	public SuperBean getBean(Object superBean, String... parameter) {

		cb = (CountryBean) superBean;
		this.cb.setCountry_name(parameter[0]);
		return this.cb;
	}

}
