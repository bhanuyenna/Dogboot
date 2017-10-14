package org.java.develop.Dao;

import java.util.List;

import org.java.develop.model.Breed;
import org.java.develop.model.Dog;

public interface BreedDao {
	public List<Breed> getAllBreeds();
	public List<Breed> getAllBreedsbyName(String name);
	//public List<Dog> getAllDogsByBreed();

}
