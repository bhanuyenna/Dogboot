package com.disney.develop.repository;

import org.springframework.data.repository.CrudRepository;

import com.disney.develop.model.Breed;

/**
 * JPA {@link BreedRepository} for {@link Breed} 
 * 
 * @author Bhanu
 *
 */
public interface BreedRepository extends CrudRepository<Breed, Integer> {
	/**
	 * This method is to get the Breed object based on breedName
	 * 
	 * @param breed
	 * @return
	 */
	Breed getByBreedName(String breed);

}
