package com.dp.creational.builder;

import com.dp.creational.builder.dto.UserDTO;

public class UserDTOBuilder {
	
	private String firstName;
	private String lastName;
	private int zipCode;

	public UserDTOBuilder withFirstName(String fname) {
		fname =   "Mr."+fname;
		this.firstName = fname;
		return this;
	}
	
	public UserDTOBuilder withLastName(String lname) {
		this.lastName = lname;
		return this;
	}
	
	public UserDTOBuilder withZipcode(int zipCode) {
		this.zipCode = zipCode;
		return this;
	}
	
	public UserDTO build() {
		return new UserDTO(firstName, lastName, zipCode);
	}
}
