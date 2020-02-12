package com.example.demo.animal.fishes;

import com.example.demo.animal.features.Animal;

public class Fish implements Animal{
	
	public boolean swim() {
		return true;
	}
	public boolean walk() {
		return false;
	}
	public boolean sing() {
		return false;
	}
	@Override
	public boolean fly() {
		return false;
	}
	

}
