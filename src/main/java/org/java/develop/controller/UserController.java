package org.java.develop.controller;

import org.java.develop.model.Breed;
import org.java.develop.model.User;
import org.java.develop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
 * @author Bhanu Rest Controller {@link User} for getting the breed related data
 *         
 */

@RestController
@RequestMapping("/api/User")
@Api(value = "Dog Controller API", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
	@Autowired
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * This method returns the User Entity based on the UserName
	 * @param userName
	 * @return
	 */
	@RequestMapping(value = "/getDogBy/{userName}", method = RequestMethod.GET)
	@ApiOperation("Get User on a specific userName")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = User.class) })
	public @ResponseBody User getUser(@PathVariable("userName") String userName) {

		return (User) userService.getByUsername(userName);

	}

}
