package com.heaven.observerPatts;

public class Observer3 implements IObserver {
	@Override
	public void update(String name, int value) {
		System.out.println("Observer3: The subject"+name+"has changed the value to"+value);
		
	}
}
