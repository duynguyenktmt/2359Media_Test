package com.example.demo.animal.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class AnimalDAO {
	private static final Map<String, Animal> animals = new HashMap<String, Animal>();
	
	static {
        initAnimals();
    }

	private static void initAnimals() {
		Animal animal1 = new Animal("Rooster", "singMultilang", "Bird");
		Animal animal2 = new Animal("Duck", "swim", "Bird");
		Animal animal3 = new Animal("Shark", "eat other fish", "Fish");
		
		animals.put(animal1.getName(), animal1);
		animals.put(animal2.getName(), animal2);
		animals.put(animal3.getName(), animal3);
	}
	

	public Animal getName(String name) {
        return animals.get(name);
    }
	
	public List<Animal> getAllAnimals() {
        Collection<Animal> c = animals.values();
        List<Animal> list = new ArrayList<Animal>();
        list.addAll(c);
        return list;
    }
}
