package org.java.develop.repository;

import org.java.develop.model.Breed;
import org.springframework.data.repository.CrudRepository;

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
