package com.example.demo.animal.mammals;

import com.example.demo.animal.features.Animal;
import com.example.demo.animal.features.FishFeatures;
import com.example.demo.animal.fishes.Fish;

public class Dolphin implements FishFeatures, Animal{
	
	Fish dolphin;
	
	public void hasFishBehaviour(Fish fish)
	{
		this.dolphin = fish;
	}
	
	@Override
	public boolean swim() {
		return true;
	}
	
	public boolean sing() {
		return true;
	}


	@Override
	public void size() {
		System.out.println("Maybe large like Shark");

	}

	@Override
	public void colour() {
		System.out.println("Blue or Black");
	}

	@Override
	public boolean eat() {
		return true;
	}

	@Override
	public boolean makeJokes() {
		return true;
	}

	@Override
	public boolean walk() {
		return false;
	}

	@Override
	public boolean fly() {
		return false;
	}

}
