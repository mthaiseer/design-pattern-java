package com.dp.structutal.adapter.core;

public class EmployeeObjectAdapter implements Customer{
	
	private Employee employee;

	public EmployeeObjectAdapter(Employee employee) {
		this.employee  = employee;
	}

	@Override
	public String fullName() {
		return employee.getFirstName()+ ","+ employee.getLastName();
	}

}
