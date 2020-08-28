package com.dp.structutal.adapter.core;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class AdapterTest {
	
	
	/**
	 * Need to convert Employee to customer
	 */
	void populate(Employee employee) {
		employee.setFirstName("Mohamed");
		employee.setLastName("Thaiseer");
	}
	
	@Test
	void testAdapter() {
		
		//Legacy or adaptee code
		Employee employee = new Employee();
		populate(employee);
		assertThat(employee).isNotNull();
		assertThat(employee.getFirstName()).isEqualTo("Mohamed");
		
		//adapter object which convert employee to customer 
		EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
		
		//customer object being passed to client 
		String actual  = CustomerProcessor.process(objectAdapter);
		assertThat(actual).isNotEmpty();
		assertThat(actual).isEqualTo("Mohamed,Thaiseer");
	}

}
