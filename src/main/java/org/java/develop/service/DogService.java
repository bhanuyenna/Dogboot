package org.java.develop.service;

import java.util.List;

import org.java.develop.model.Dog;

public interface DogService {
	public Dog getByDogId(int id);

	public List<Dog> getAllDogs();

	public Dog getDogByImageUrl(String imageurl);

}
