package com.example.demo.animal.wings;

import com.example.demo.animal.features.Animal;
import com.example.demo.animal.mammals.Cat;
import com.example.demo.animal.mammals.Dog;

public class Parrot implements Animal{

	Animal animal = null;
	Dog dog = null;
	Cat cat = null;
	Duck duck = null;
	Rooster rooster = null;
	
	public void livingWith(Animal animal) {
		this.animal = animal;		  
	}
	
	public boolean walk() {
		return true;
	}
	
	public boolean fly() {
		return true;
	}
	
	public boolean sing() {
		if(dog == animal) {
			this.livingWith(new Dog());
			System.out.println("Woof, woof");
		} 
		else if(cat == animal) {
			this.livingWith(new Cat());
			System.out.println("Meow");
		}
		else if(rooster == animal) {
			this.livingWith(new Chicken());
			System.out.println("Cock-a-doodle-doo");
		}
		else if(duck == animal) {
			this.livingWith(new Duck());
		}
		else if(null == animal) {
			this.livingWith(animal);
		}
		animal.sing();
		return true;
	}

	@Override
	public boolean swim() {
		return false;
	}

	

}
