package com.dp.creational.builder.entity;

public class User {

	private String fname;
	private String lname;
	private int pincode;

	public User(String fname, String lname, int pincode) {
		this.fname = fname;
		this.lname = lname;
		this.pincode = pincode;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", pincode=" + pincode + "]";
	}

}
