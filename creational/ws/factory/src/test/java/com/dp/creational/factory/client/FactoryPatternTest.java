package com.dp.creational.factory.client;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.dp.creational.factory.core.JSONMessageCreator;
import com.dp.creational.factory.core.MessageCreator;
import com.dp.creational.factory.core.XMLMessageCreator;

public class FactoryPatternTest {
	
	@Test
	void testFactoryJSON() {
		
		 MessageCreator messageCreator = new JSONMessageCreator();
		 String message = messageCreator.getMessage();
		 assertThat(message).isNotNull();
		 assertThat(message).isEqualTo("JSON Message");
	}
	
	@Test
	void testFactoryXML() {
		
		 MessageCreator messageCreator = new XMLMessageCreator();
		 String message = messageCreator.getMessage();
		 assertThat(message).isNotNull();
		 assertThat(message).isEqualTo("XML Message");
	}

}
