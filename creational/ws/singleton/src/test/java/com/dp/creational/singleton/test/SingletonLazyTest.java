package com.dp.creational.singleton.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.dp.creational.singleton.core.SingletonLazy;

public class SingletonLazyTest {
	
	
	@Test
	void testSingletonLazy() {
		
		SingletonLazy obj = SingletonLazy.getInstance();
		SingletonLazy obj2 = SingletonLazy.getInstance();
		
		assertThat(obj).isEqualTo(obj2);
	}
	

}
