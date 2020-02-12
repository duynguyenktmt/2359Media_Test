package com.example.demo.animal.fishes;

import com.example.demo.animal.features.FishFeatures;

public class Clownfish extends Fish implements FishFeatures{

	public void size() {
		System.out.println("I am small");
		
	}
	
	public void colour() {
		System.out.println("I am Orange in colour");
		
	}
	
	
	public boolean makeJokes() {
		System.out.println("I make Jokes");
		return true;
		
	}

	@Override
	public boolean swim() {
		return true;
	}

	@Override
	public boolean eat() {
		// TODO Auto-generated method stub
		return false;
	}
}
