package org.java.develop.repository;

import org.java.develop.model.Breed;
import org.java.develop.model.Dog;
import org.springframework.data.repository.CrudRepository;

/**
 * JPA {@link DogRepository} for {@link Dog} 
 * 
 * @author Bhanu
 *
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	/**
	 * This method is to get the Dog object based on the dogid
	 * 
	 * @param id
	 * @return
	 */
	Dog getByDogId(int dogId);

	/**
	 * This method is to get dog object based on the image url of the dog
	 * 
	 * @param imageurl
	 * @return
	 */
	Dog getByImageUrl(String imageUrl);

}
