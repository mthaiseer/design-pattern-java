package com.dp.creational.builder.director;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dp.creational.builder.UserDTOBuilder;
import com.dp.creational.builder.dto.UserDTO;
import com.dp.creational.builder.entity.User;

public class DirectorTest {
	
	@Test
	void testBuilder() {
		
		User user = new User("mohamed", "thaiseer", 680512);
		
		UserDTOBuilder builder = new UserDTOBuilder();
		
		UserDTO userDto = builder
			.withFirstName(user.getFname())
			.withLastName(user.getLname())
			.withZipcode(user.getPincode())
			.build();
		
		assertThat(userDto).isNotNull();
		assertAll("Values should return as expected", ()->{
			assertEquals("Mr.mohamed", userDto.getFirstName());
			assertEquals("thaiseer", userDto.getLastName());
			assertEquals(680512, userDto.getZipCode());
			
		});
	}

}
