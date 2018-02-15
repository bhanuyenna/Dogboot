package org.java.develop.service;

import org.java.develop.model.Dog;
import org.java.develop.model.User;
import org.java.develop.model.Userdoglike;

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
