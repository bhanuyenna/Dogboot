package org.java.develop.Controller;

import java.util.ArrayList;
import java.util.List;

import org.java.develop.model.Breed;
import org.java.develop.model.Dog;
import org.java.develop.service.BreedService;
import org.java.develop.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Dog")
public class DogController {
	@Autowired
	private DogService dogService;

	public void setDogService(DogService dogService) {
		this.dogService = dogService;
	}
	
	// Get Single Dog by id
	@RequestMapping(value = "/getDogBy/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<Dog> getDog(@PathVariable("id") int id) {
		Dog dog = dogService.getByDogId(id);
		System.out.println("The number of like for dog\t---"+dog.getDogname()+"---is---"+dog.getUserdoglikes().size());
		return new ResponseEntity<Dog>(dog, HttpStatus.OK);

	}
	
	
	
	
	
	
	}
