package com.spring.core.IOC;

public class Airtel implements Sim {

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling via Airtel Sim");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("browsing via Airtel Sim");
	}
	
}
