package com.dp.creational.sf.factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.dp.creational.sf.factory.ConnectionParams.*;


import com.dp.creational.sf.connection.Connection;

public class ConnectionFactoryTest {
	
	@Test
	void testDatabaseConnection() {
		
		Connection database = ConnectionFactory.getInstance(db());
		assertThat(database.connect()).isEqualTo(database());
		
	}
	
	@Test
	void testLDAPConnection() {
		
		Connection database = ConnectionFactory.getInstance(ldap());
		assertThat(database.connect()).isEqualTo(ldap());
		
	}
	
	@Test
	void testUnknowConnection() {
		
		 Assertions.assertThrows(IllegalArgumentException.class, () -> {
				Connection database = ConnectionFactory.getInstance(unknow());
		});
	
	}

}
