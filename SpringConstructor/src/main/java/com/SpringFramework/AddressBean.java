package com.SpringFramework;


public class AddressBean {
	private int roadno;
	private String city;
	private String State;
	public AddressBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddressBean(int roadno, String city, String state) {
		super();
		this.roadno = roadno;
		this.city = city;
		this.State = state;
	}
	public int getRoadno() {
		return roadno;
	}
	public void setRoadno(int roadno) {
		this.roadno = roadno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
	this.State = state;
	}
	@Override
	public String toString() {
		return "AddressBean [roadno=" + roadno + ", city=" + city + ", State=" + State + "]";
	}
	
}