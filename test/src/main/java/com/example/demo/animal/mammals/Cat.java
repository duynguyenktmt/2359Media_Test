package com.example.demo.animal.mammals;

import com.example.demo.animal.features.Animal;

public class Cat implements Animal{

	@Override
	public boolean swim() {
		return false;
		
	}

	
	@Override
	public boolean walk() {
		return true;
		
	}

	@Override
	public boolean sing() {
		return false;
		
	}

	@Override
	public boolean fly() {
		return false;
		
	}

}
