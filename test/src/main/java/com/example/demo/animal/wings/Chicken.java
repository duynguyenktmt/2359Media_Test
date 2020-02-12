package com.example.demo.animal.wings;

public class Chicken extends Bird{


	@Override
	public boolean sing() {
		System.out.println("Cluck,cluck");
		return true;
	}

	@Override
	public boolean fly() {
		System.out.println("I can't fly");
		return false;
	}
	
	public void singMultilang(String language) {
		//relative between Chicken & Rooster
	}
	
	@Override
	public boolean walk() {
		return true;
	}

	@Override
	public boolean swim() {
		return false;
	}

	
}
