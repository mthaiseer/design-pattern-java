package com.dp.creational.singleton.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.dp.creational.singleton.core.SingletonEager;

public class SingletonTest {
	
	
	@Test
	void testSingleTonEager() {
		
		SingletonEager obj =  SingletonEager.getInstance();
		SingletonEager obj2 =  SingletonEager.getInstance();
		
		assertThat(obj).isEqualTo(obj2);
		
	}

}
