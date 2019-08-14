package com.heaven.observerPatts;

import java.util.ArrayList;
import java.util.List;

public class Subject2 implements ISubject {
	
	private int v;
	
	List<IObserver> observerList = new ArrayList<IObserver>();
	
	
	public int getValue() {
		return v;
	}

	public void setValue(int value) {
		this.v = value;
		this.notifyObservers(v);
	}

	@Override
	public void register(IObserver o) {
		observerList.add(o);
		
	}

	@Override
	public void deregister(IObserver o) {
		observerList.remove(o);
	}

	@Override
	public void notifyObservers(int value) {
		for (int i =0;i< observerList.size();i++) {
			observerList.get(i).update("Subject2", value);
		}
	}
}
