package org.java.develop.service;

import java.util.List;

import org.java.develop.model.Breed;
import org.java.develop.model.Dog;

public interface BreedService {
	public List<Breed> getAllBreeds();
	public List<Breed> getAllBreedsbyName(String name);

}
