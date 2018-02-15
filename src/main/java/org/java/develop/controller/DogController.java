package org.java.develop.controller;

import java.util.List;

import org.java.develop.model.Dog;
import org.java.develop.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author Bhanu Rest Controller {@link Dog} for getting the breed related data
 * 
 */
@RestController
@RequestMapping("/api/Dog")
@Api(value = "Dog Controller API", produces = MediaType.APPLICATION_JSON_VALUE)

public class DogController {
	@Autowired(required = true)
	private DogService dogService;

	public void setDogService(DogService dogService) {
		this.dogService = dogService;
	}

	/**
	 * This method is to get the Dog based on the
	 * 
	 * @param dogId
	 *            and
	 * @return the Dog Object
	 */
	@RequestMapping(value = "/getDogBy/{dogId}", method = RequestMethod.GET)
	@ApiOperation("Get Dog on a specific id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Dog.class) })
	public @ResponseBody ResponseEntity<Dog> getDog(@PathVariable("dogId") int dogId) {
		Dog dog = dogService.getByDogId(dogId);
		return new ResponseEntity<Dog>(dog, HttpStatus.OK);

	}

	/**
	 * This method returns the list of all the dogs in the databse
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getAllDogs", method = RequestMethod.GET)
	@ApiOperation("Get all the dogs on votes of the dog")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Dog.class) })
	public @ResponseBody ResponseEntity<List<Dog>> getAllDogs() {
		List<Dog> dogs = dogService.getAllDogs();
		return new ResponseEntity<List<Dog>>(dogs, HttpStatus.OK);
	}

}
