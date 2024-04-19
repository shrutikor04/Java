package com.eb.entity;

public class Address {

	private String city;
	
	private String district;

	@Override
	public String toString() {
		return "Address [city=" + city + ", district=" + district + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
}
