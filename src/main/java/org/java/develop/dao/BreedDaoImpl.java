package org.java.develop.dao;

import java.util.List;

import org.java.develop.model.Breed;
import org.java.develop.repository.BreedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This Class is implementation of {@link BreedDao} interface
 * @author Bhanu
 *
 */
@Repository
public class BreedDaoImpl implements BreedDao {
	
	/**
	 * This is autowiring the breed repository and using in the class
	 */
	@Autowired()
	private BreedRepository breedRepository;

	/**
	 * This method returns the list of breed objects
	 * @return
	 */
	@Override
	public List<Breed> getAllBreeds() {
		return (List<Breed>) breedRepository.findAll();
	}

	/**
	 * This method returns the Breed objects based on the name of the breed
	 * @param name
	 * @return
	 */
	@Override
	public Breed getBreedbyName(String name) {

		return breedRepository.getByBreedName(name);
	}

}
