package com.heaven.observerPatts;

public class Observer1 implements IObserver {

	

	
	
	@Override
	public void update(String name, int value) {
		System.out.println("Observer1: The"+name+"has changed the value to"+value);
		
	}

}
