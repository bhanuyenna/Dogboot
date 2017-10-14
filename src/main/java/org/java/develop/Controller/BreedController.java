package org.java.develop.Controller;

import java.util.List;

import org.java.develop.model.Breed;
import org.java.develop.model.Dog;
import org.java.develop.model.Views;
import org.java.develop.service.BreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

@RestController
@RequestMapping("/Breed")
public class BreedController {
	@Autowired
	private BreedService breedService;

	public void setBreedService(BreedService breedService) {
		this.breedService = breedService;
	}

	// get all Breeds
	@RequestMapping(value = "/getAllBreeds", method = RequestMethod.GET)
	public ResponseEntity<List<Breed>> listAllBreeds() {

		List<Breed> breeds = breedService.getAllBreeds();

		return new ResponseEntity<List<Breed>>(breeds, HttpStatus.OK);
	}

		@RequestMapping(value = "/getBreedsBy/{breedname}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<Breed>> getBreedbyName(@PathVariable("breedname") String name) {
		List<Breed> breeds = breedService.getAllBreedsbyName(name);
		return new ResponseEntity<List<Breed>>(breeds, HttpStatus.OK);

	}

}
