package com.dp.creational.factory.core;

import com.dp.creational.factory.product.Message;

public abstract class MessageCreator {
	
	public String getMessage() {
		
		Message message = createMessage();
		message.encrypt();
		return message.message();
		
	}
	
	public abstract Message createMessage(); 
	

}
