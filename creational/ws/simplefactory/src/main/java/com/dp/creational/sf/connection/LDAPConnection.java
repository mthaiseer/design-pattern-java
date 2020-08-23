package com.dp.creational.sf.connection;

public class LDAPConnection implements Connection {

	@Override
	public String connect() {
		return "LDAP";
	}

}
