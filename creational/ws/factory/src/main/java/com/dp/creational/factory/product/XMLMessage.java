package com.dp.creational.factory.product;

public class XMLMessage extends Message {
	
	@Override
	public void encrypt() {System.out.println("XML overriden encrypt encrypt");}

	@Override
	public String message() {
		return "XML Message";
	}

}
