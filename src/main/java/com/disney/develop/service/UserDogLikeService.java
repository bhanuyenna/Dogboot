package com.disney.develop.service;

import com.disney.develop.model.Dog;
import com.disney.develop.model.User;
import com.disney.develop.model.Userdoglike;

/**
 * This interface is service layer for Userdoglike Entity
 * 
 * @author Bhanu
 *
 */
public interface UserDogLikeService {

	public Userdoglike saveDogLike(String username, String imageurl,Boolean isLike);
	
	public Userdoglike updateDogLike(String username, String imageurl,Boolean isLike);
	
	public Boolean getUserDogLike(Dog d, User user);
}
