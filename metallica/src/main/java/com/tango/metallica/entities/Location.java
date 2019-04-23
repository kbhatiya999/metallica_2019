package com.tango.metallica.entities;

public class Location {
	private int locationId;
	private String cityName; 
	private String stateName;
	private int countryName;
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getCountryName() {
		return countryName;
	}
	public void setCountryName(int countryName) {
		this.countryName = countryName;
	}
	
	
}
