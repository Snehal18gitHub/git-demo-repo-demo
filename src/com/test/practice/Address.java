package com.test.practice;

public class Address {
	
	private String streetName;
	private long pinCode;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", pinCode=" + pinCode + "]";
	}
	public Address(String streetName, long pinCode) {
		super();
		this.streetName = streetName;
		this.pinCode = pinCode;
	}
	
	
	

}
