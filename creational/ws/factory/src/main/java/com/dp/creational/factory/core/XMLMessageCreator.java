package com.dp.creational.factory.core;

import com.dp.creational.factory.product.Message;
import com.dp.creational.factory.product.XMLMessage;

public class XMLMessageCreator extends MessageCreator {
	
	@Override
	public Message createMessage() {
		return new XMLMessage();
	}

}
