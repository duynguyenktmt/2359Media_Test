package com.example.demo.animal.insects;

import com.example.demo.animal.features.Animal;
import com.example.demo.animal.features.ButterflyFeatures;

public class Butterfly implements ButterflyFeatures, Animal{
	
	boolean isCaterpillar= false;
	

	public boolean isCaterpillar() {
		return isCaterpillar;
	}

	public void setCaterpillar(boolean isCaterpillar) {
		this.isCaterpillar = isCaterpillar;
	}
	
	public boolean fly() {
		if(isCaterpillar)
		{
			System.out.println("I cannot fly ");
			return false;
		}else
		{
			System.out.println("I am flying");
			return true;
		}
	}
	
	public boolean sing() {
		System.out.println("Does not make a sound");
		return false;
	}
	
	@Override
	public boolean walk() {
		if(isCaterpillar)
		{
			System.out.println("I can walk/crawl");
			return true;
		}else
		{
			System.out.println("I cannot walk");
			return false;
		}
	}
	
	@Override
	public boolean swim() {
		return false;
	}


}
