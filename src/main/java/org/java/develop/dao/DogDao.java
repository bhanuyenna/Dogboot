package org.java.develop.dao;

import java.util.List;

import org.java.develop.model.Dog;

public interface DogDao {

	public Dog getDogByID(int id);

	public List<Dog> getAllDogs();

	public Dog getByImageUrl(String imageurl);

}
