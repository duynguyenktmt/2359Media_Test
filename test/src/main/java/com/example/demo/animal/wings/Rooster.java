package com.example.demo.animal.wings;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.animal.features.Animal;

public class Rooster implements Animal{
	
	Chicken rooster;
		
	void hasChickenBehaviour(Chicken chicken)
	{
		this.rooster = chicken;
	}
	
	public boolean fly() {
		System.out.println("I can't fly");
		return false;
	}
	
	public boolean walk() {
		return true;
	}
	
	private static final Map<String, String> langMap;
	static {
		langMap = new HashMap<>();
		langMap.put("English", "Cock-a-doodle-doo");
		langMap.put("Danish", "kykyliky");
		langMap.put("Dutch", "kukeleku");
		langMap.put("Finnish", "kukko kiekuu");
		langMap.put("French", "cocorico");
		langMap.put("German", "kikeriki");
		langMap.put("Greek", "kikiriki");
		langMap.put("Hebrew", "coo-koo-ri-koo");
		langMap.put("Hungarian", "kukuriku");
		langMap.put("Italian", "chicchirichi");
		langMap.put("Japanese", "ko-ke-kok-ko-o");
		langMap.put("Portuguese", "cucurucu");
		langMap.put("Russian", "kukareku");
		langMap.put("Swedish", "kuckeliku");
		langMap.put("Turkish", "kuk-kurri-kuuu");
		langMap.put("Urdu", "kuklooku");
	}
	
	@Override
	public boolean sing() {
		return true;
	}
	
	public void singMultilang(String language) {
		if(null== language || language.isEmpty())
		{
			//default as English
			rooster.singMultilang("Cock-a-doodle-doo");
		}
		else
		{
			System.out.println(langMap.get(language));
		}
	}

	@Override
	public boolean swim() {
		return false;
	}
	
}
