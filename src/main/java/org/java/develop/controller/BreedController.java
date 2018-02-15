package org.java.develop.controller;

import java.util.ArrayList;
import java.util.List;

import org.java.develop.model.Breed;
import org.java.develop.service.BreedService;
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
 * @author Bhanu Rest Controller {@link Breed} for getting the breed related
 *         data
 */
@RestController
@RequestMapping("/api/Breed")
@Api(value = "Breed Controller API", produces = MediaType.APPLICATION_JSON_VALUE)
public class BreedController {
	@Autowired
	private BreedService breedService;

	public void setBreedService(BreedService breedService) {
		this.breedService = breedService;
	}

	/**
	 * This method returns the list Of all Breeds and dogs in that breed
	 * @return
	 */
	@RequestMapping(value = "/getAllBreeds", method = RequestMethod.GET)
	@ApiOperation("Get all the breeds and dogs in the breed")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Breed.class) })
	public ResponseEntity<List<Breed>> listAllBreeds() {
		List<Breed> breeds = new ArrayList<Breed>();

		breeds = breedService.getAllBreeds();

		return new ResponseEntity<List<Breed>>(breeds, HttpStatus.OK);
	}

	/**
	 * This method returns the breed entity of a particular breed
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/getBreedsBy/{breedname}", method = RequestMethod.GET)
	@ApiOperation("Get Breed by a specific breed name")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Breed.class) })
	public @ResponseBody ResponseEntity<Breed> getBreedbyName(@PathVariable("breedname") String name) {
		Breed breeds = breedService.getAllBreedsbyName(name);
		return new ResponseEntity<Breed>(breeds, HttpStatus.OK);

	}

}
