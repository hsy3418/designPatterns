package com.heaven.observerPatts;

public interface ISubject {
	void register(IObserver o);
	void deregister(IObserver o);
	void notifyObservers(int value);
}
