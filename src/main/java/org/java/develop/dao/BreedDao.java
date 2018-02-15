package org.java.develop.dao;

import java.util.List;

import org.java.develop.model.Breed;

/**
 * DataAccessObject for {@link Breed}
 * 
 */
public interface BreedDao {
	
	/**
	 * This method returns the list of breed objects
	 * @return
	 */
	public List<Breed> getAllBreeds();

	/**
	 * This method returns the Breed objects based on the name of the breed
	 * @param name
	 * @return
	 */
	public Breed getBreedbyName(String name);

}
