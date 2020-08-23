package com.dp.creational.builder.dto;

import com.dp.creational.builder.UserDTOBuilder;

public class UserDTO {
	
	private String firstName;
	private String lastName;
	private int zipCode;
	
	
	public UserDTO(String firstName, String lastName, int  zipCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.zipCode = zipCode;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getZipCode() {
		return zipCode;
	}


	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	

}
