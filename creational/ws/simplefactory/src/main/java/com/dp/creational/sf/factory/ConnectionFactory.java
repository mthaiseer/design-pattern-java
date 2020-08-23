package com.dp.creational.sf.factory;

import com.dp.creational.sf.connection.Connection;
import com.dp.creational.sf.connection.DatabaseConnection;
import com.dp.creational.sf.connection.LDAPConnection;

public class ConnectionFactory {
	
	public static Connection getInstance(String type) {
		
		switch (type) {
		case "DB":
			return new DatabaseConnection();
			
		case "LDAP":
			return new LDAPConnection();
			
		default:
			throw new IllegalArgumentException("Unknown type");
		}
		
		
		
	}

}
