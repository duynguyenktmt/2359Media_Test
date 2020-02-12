package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.animal.features.Animal;
import com.example.demo.animal.fishes.Clownfish;
import com.example.demo.animal.fishes.Fish;
import com.example.demo.animal.fishes.Shark;
import com.example.demo.animal.insects.Butterfly;
import com.example.demo.animal.mammals.Cat;
import com.example.demo.animal.mammals.Dog;
import com.example.demo.animal.mammals.Dolphin;
import com.example.demo.animal.mammals.Frog;
import com.example.demo.animal.wings.Bird;
import com.example.demo.animal.wings.Chicken;
import com.example.demo.animal.wings.Duck;
import com.example.demo.animal.wings.Parrot;
import com.example.demo.animal.wings.Rooster;


public class Solution {

	public static void main(String[] args) {
		System.out.println("----------------DUCK----------------");
		Animal duck =  new Duck();
		duck.walk();
		duck.fly();
		duck.sing();
		duck.swim();
		System.out.println("----------------CHICKEN----------------");
		Animal chicken =  new Chicken();
		chicken.walk();
		chicken.fly();
		chicken.sing();
		chicken.swim();
		System.out.println("----------------ROOSTER----------------");
		Rooster rooster =  new Rooster();
		rooster.fly();
		rooster.walk();
		//rooster.singMultilang(langMap.get(language));
		System.out.println("----------------PARROT LIVING WITH DOGS----------------");
		Parrot parrotwithDogs =  new Parrot();
		parrotwithDogs.livingWith(new Dog());
		parrotwithDogs.walk();
		parrotwithDogs.fly();
		parrotwithDogs.sing();
		System.out.println("----------------PARROT LIVING WITH CATS----------------");
		Parrot parrotwithCats =  new Parrot();
		parrotwithCats.livingWith(new Cat());
		parrotwithCats.walk();
		parrotwithCats.fly();
		parrotwithCats.sing();
		System.out.println("----------------PARROT LIVING WITH ROOSTERS----------------");
		Parrot parrotWithRoosters =  new Parrot();
		parrotWithRoosters.livingWith(new Chicken());
		parrotWithRoosters.walk();
		parrotWithRoosters.fly();
		parrotWithRoosters.sing();
		System.out.println("----------------PARROT LIVING WITH DUCKS----------------");
		Parrot parrotWithDucks =  new Parrot();
		parrotWithDucks.livingWith(new Duck());
		parrotWithDucks.walk();
		parrotWithDucks.fly();
		parrotWithDucks.sing();
		System.out.println("----------------SHARK----------------");
		Shark shark = new Shark();
		shark.fly();
		shark.sing();
		shark.walk();
		shark.swim();
		shark.colour();
		shark.eat();
		shark.makeJokes();
		System.out.println("----------------CLOWNFISH----------------");
		Clownfish cFish = new Clownfish();
		cFish.fly();
		cFish.sing();
		cFish.walk();
		cFish.swim();
		cFish.colour();
		cFish.eat();
		cFish.makeJokes();
		System.out.println("----------------DOLPHIN----------------");
		Dolphin dolphin = new Dolphin();
		dolphin.hasFishBehaviour(new Shark());
		dolphin.sing();
		dolphin.swim();
		System.out.println("----------------BUTTERFLY----------------");
		Butterfly butterFly =  new Butterfly();
		butterFly.setCaterpillar(false);
		butterFly.fly();
		butterFly.walk();
		butterFly.swim();
		butterFly.sing();
		System.out.println("----------------CATERPILLAR----------------");
		Butterfly caterpillar =  new Butterfly();
		butterFly.setCaterpillar(false);
		caterpillar.fly();
		caterpillar.walk();
		caterpillar.swim();
		caterpillar.sing();
		System.out.println("----------------Animal Count----------------");
	
		Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
		};
		
		int countFlying = 0 ;
		int countWalk = 0 ;
		int countSing = 0 ;
		int countSwim = 0 ;
		
		for (Animal animal : animals) {
			   System.out.println(animal.getClass().getName() + "---count start--------------------");
			   if(animal.fly())
				   countFlying++;
			    if(animal.walk())
				   countWalk++;
			    if(animal.sing())
				   countSing++;
			    if(animal.swim())
				   countSwim++;
			    System.out.println("------------------------count end---------------------");
		}
		
		System.out.println("Number of Animals that can fly: " + countFlying);
		System.out.println("Number of Animals that can walk: " + countWalk);
		System.out.println("Number of Animals that can sing: " + countSing);
		System.out.println("Number of Animals that can swim: " + countSwim);
		
		System.out.println("---------------------------Test Language- ROOSTER--------------------"); 		   
		Rooster myRstr = new Rooster();
		
		List<String> arrayList = new ArrayList<String>(){{
		    add("English");
	        add("Danish");
	        add("Dutch");
	        add("Finnish");
	        add("French");
	        add("German");
	        add("Greek");
	        add("Hebrew");
	        add("Hungarian");
	        add("Italian");
	        add("Japanese");
	        add("Portuguese");
	        add("Russian");
	        add("Swedish");
	        add("Turkish");
	        add("Urdu");
		}}; 
		
		for (String lang : arrayList) {
			myRstr.singMultilang(lang);
		}
	}
}
