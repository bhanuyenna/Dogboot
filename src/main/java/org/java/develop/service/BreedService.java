package org.java.develop.service;

import java.util.List;

import org.java.develop.model.Breed;

/**
 * This interface is service layer for breed Entity
 * 
 * @author Bhanu
 *
 */
public interface BreedService {
	/**
	 * This method returns the list of breed objects
	 * 
	 * @return
	 */
	public List<Breed> getAllBreeds();

	/**
	 * This method returns the Breed objects based on the name of the breed
	 * 
	 * @param name
	 * @return
	 */
	public Breed getAllBreedsbyName(String name);

}
