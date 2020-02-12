package com.example.demo.animal.fishes;

import com.example.demo.animal.features.FishFeatures;

public class Shark extends Fish implements FishFeatures{

	
	public void size() {
		System.out.println("I am large");
		
	}
	
	public void colour() {
		System.out.println("I am grey in colour");
		
	}
	
	public boolean eat() {
		System.out.println("I can eat other fish");
		return true;
	}


	@Override
	public boolean swim() {
		return true;
	}

	@Override
	public boolean makeJokes() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
