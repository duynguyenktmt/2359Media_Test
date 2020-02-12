package com.example.demo.animal.wings;

import com.example.demo.animal.features.Animal;

public class Bird implements Animal{
	public boolean walk() {
		return true;
	}
	public boolean sing() {
		return true;
	}
	public boolean fly() {
		return true;
	}
	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		return false;
	}
}

