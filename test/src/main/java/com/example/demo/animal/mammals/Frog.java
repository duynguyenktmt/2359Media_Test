package com.example.demo.animal.mammals;

import com.example.demo.animal.features.Animal;

public class Frog implements Animal{

	@Override
	public boolean swim() {
		return true;
	}

	
	public boolean jump() {
		return true;
	}


	@Override
	public boolean walk() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean sing() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
	}



}
