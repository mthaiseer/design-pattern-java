package com.dp.creational.factory.product;

public abstract class Message {
	
	public void encrypt() {System.out.println("Default encrypt");}
	
	public abstract String message();

}
