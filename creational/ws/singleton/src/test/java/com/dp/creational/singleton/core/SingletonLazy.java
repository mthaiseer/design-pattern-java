package com.dp.creational.singleton.core;

public class SingletonLazy {
	
	private SingletonLazy() {
		
	}

	//method to public 
	public static SingletonLazy getInstance() {
		return InstanceHolder.INSTANCE;
	}
	
	//private class
	private static class InstanceHolder{
		static final SingletonLazy INSTANCE = new SingletonLazy();
	}

}
