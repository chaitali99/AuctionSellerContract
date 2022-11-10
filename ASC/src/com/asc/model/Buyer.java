package com.asc.model;

public class Buyer {
	
	private int buyerId;
	private String name;
	private String city;
	private String state;
	private String pincode;
	private String country;
	private String email;
	private String password;
	public Buyer(int buyerId, String name, String city, String state, String pincode, String country, String email,
			String password) {
		super();
		this.buyerId = buyerId;
		this.name = name;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
		this.email = email;
		this.password = password;
	}
	public Buyer() {
		super();
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	@Override
	public String toString() {
		return "Buyer [buyerId=" + buyerId + ", name=" + name + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + ", country=" + country + ", email=" + email + ", password=" + password + "]";
	}
	
	

}
