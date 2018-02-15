package org.java.develop.service;

import java.util.List;

import org.java.develop.model.Dog;

/**
 * This interface is service layer for Dog Entity
 * 
 * @author Bhanu
 *
 */
public interface DogService {
	public Dog getByDogId(int id);

	public List<Dog> getAllDogs();

	public Dog getDogByImageUrl(String imageurl);

}
