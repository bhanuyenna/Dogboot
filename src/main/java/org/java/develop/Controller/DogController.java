package org.java.develop.Controller;

import java.util.List;

import org.java.develop.model.Dog;
import org.java.develop.model.Userdoglike;
import org.java.develop.service.DogService;
import org.java.develop.service.UserDogLikeService;
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

@RestController
@RequestMapping("/api/Dog")
@Api(value = "Dog Controller API", produces = MediaType.APPLICATION_JSON_VALUE)

public class DogController {
	@Autowired(required  = true)
	private DogService dogService;

	@Autowired(required  = true)
	private UserDogLikeService userDogLikeService;

	public void setDogService(DogService dogService) {
		this.dogService = dogService;
	}

	// Get Single Dog by id
	@RequestMapping(value = "/getDogBy/{id}", method = RequestMethod.GET)
	@ApiOperation("Get Dog on a specific id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Dog.class) })
	public @ResponseBody ResponseEntity<Dog> getDog(@PathVariable("id") int id) {
		Dog dog = dogService.getByDogId(id);
		return new ResponseEntity<Dog>(dog, HttpStatus.OK);

	}

	// list of all dogs
	@RequestMapping(value = "/getAllDogs", method = RequestMethod.GET)
	@ApiOperation("Get all the dogs on votes of the dog")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Dog.class) })
	public @ResponseBody ResponseEntity<List<Dog>> getAllDogs() {
		List<Dog> dogs = dogService.getAllDogs();
		return new ResponseEntity<List<Dog>>(dogs, HttpStatus.OK);
	}

	// like a dog by user
	@RequestMapping(value = "/saveUserdoglike/{username}/{imageurl}/{isLike}", method = RequestMethod.POST)
	@ApiOperation("Check the dog is liked by user or not and save it on users input")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Userdoglike.class) })
	public @ResponseBody ResponseEntity<Userdoglike> addUserlike(@PathVariable("username") String username,
			@PathVariable("imageurl") String imageurl, @PathVariable("isLike") Boolean isLike) {

		Userdoglike userDog = userDogLikeService.saveDogLike(username, imageurl, isLike);
		return new ResponseEntity<Userdoglike>(userDog, HttpStatus.OK);

	}
	
	//update  like a dog by user
		@RequestMapping(value = "/updateUserdoglike/{username}/{imageurl}/{isLike}", method = RequestMethod.PUT)
		@ApiOperation("update the dog like based on the user input")
		@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Userdoglike.class) })
		public @ResponseBody ResponseEntity<Userdoglike> updateUserlike(@PathVariable("username") String username,
				@PathVariable("imageurl") String imageurl, @PathVariable("isLike") Boolean isLike) {

			Userdoglike userDog = userDogLikeService.updateDogLike(username, imageurl, isLike);
			return new ResponseEntity<Userdoglike>(userDog, HttpStatus.OK);

		}

}
