package org.java.develop.service;

import java.util.List;

import org.java.develop.model.Breed;

public interface BreedService {
	public List<Breed> getAllBreeds();

	public Breed getAllBreedsbyName(String name);

	public void gethome();

}
