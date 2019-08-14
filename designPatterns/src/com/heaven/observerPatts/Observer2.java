package com.heaven.observerPatts;

public class Observer2 implements IObserver{


	@Override
	public void update(String name, int value) {
		System.out.println("Observer2: The subject"+name+"has changed the value to"+value);		
	}

}
