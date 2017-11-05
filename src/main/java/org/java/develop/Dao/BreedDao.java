package org.java.develop.Dao;

import java.util.List;

import org.java.develop.model.Breed;

public interface BreedDao {
	public List<Breed> getAllBreeds();

	public List<Breed> getAllBreedsbyName(String name);

}
