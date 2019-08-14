package com.heaven.observerPatts;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer1 observer1 = new Observer1();
		Observer2 observer2 = new Observer2();
		Observer3 observer3 = new Observer3();
		
		Subject1 subject1 = new Subject1();
		Subject2 subject2 = new Subject2();
		
		subject1.register(observer1);
		subject1.register(observer2);
		
		subject2.register(observer1);
		subject2.register(observer3);
		System.out.println("Subject1 value become 25");
		subject1.setValue(25);
		System.out.println("Subject1 value become 30");
		subject2.setValue(30);
		
		subject1.deregister(observer1);
		subject1.deregister(observer2);
		subject2.deregister(observer3);
		System.out.println("Subject1 value become 1000");
		subject1.setValue(1000);
		System.out.println("Subject1 value become 2000");
		subject2.setValue(2000);

	}

}
