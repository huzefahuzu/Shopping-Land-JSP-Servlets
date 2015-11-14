package com.bean;

public class CityBean implements SuperBean {

	private int countryId;
	private int stateId;
	private int cityId;
	private String cityName;

	CityBean cb;

	public CityBean() {
		this.countryId = 0;
		this.stateId = 0;
		this.cityId = 0;
		this.cityName = null;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public SuperBean getBean(Object superBean, String... parameter) {
		// TODO Auto-generated method stub
		cb = (CityBean) superBean;
		cb.setCountryId(Integer.parseInt(parameter[0]));
		cb.setCityName(parameter[1]);
		cb.setStateId(Integer.parseInt(parameter[2]));
		return cb;
	}

}
