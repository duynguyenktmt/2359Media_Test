package com.example.demo.animal.wings;

public class Duck extends Bird{

	@Override
	public boolean swim() {
		System.out.println("I can swim");		
		return true;
	}

	

	@Override
	public boolean walk() {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean sing() {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean fly() {
		return false;
		// TODO Auto-generated method stub
		
	}

}
