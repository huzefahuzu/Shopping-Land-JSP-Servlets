package com.bean;

public class StateBean implements SuperBean {
	private Integer stateId;
	private String stateName;
	private Integer countryId;

	public StateBean() {

		this.stateId = null;
		this.stateName = null;
		this.countryId = null;
	}

	StateBean sb;

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public SuperBean getBean(Object superBean, String... parameter) {
		// TODO Auto-generated method stub
		sb = (StateBean) superBean;
		sb.setCountryId(Integer.parseInt(parameter[0]));
		sb.setStateName(parameter[1]);
		return sb;
	}

}
