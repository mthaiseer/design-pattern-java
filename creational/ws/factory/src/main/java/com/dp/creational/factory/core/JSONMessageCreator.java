package com.dp.creational.factory.core;

import com.dp.creational.factory.product.JSONMessage;
import com.dp.creational.factory.product.Message;
import com.dp.creational.factory.product.XMLMessage;

public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

}
