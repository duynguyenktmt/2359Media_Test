package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.animal.model.Animal;
import com.example.demo.animal.model.AnimalDAO;

@RestController
public class Controller {
	@Autowired
    private AnimalDAO animalDAO;
	
	@RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }
	
	@RequestMapping(value = "/employees", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
    public List<Animal> getAllAnimals() {
        List<Animal> list = animalDAO.getAllAnimals();
        return list;
    }
}
