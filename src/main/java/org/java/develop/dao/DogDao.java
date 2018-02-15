package org.java.develop.dao;

import java.util.List;

import org.java.develop.model.Breed;
import org.java.develop.model.Dog;

/**
 * DataAccessObject for {@link DogDao}
 * 
 */
public interface DogDao {

	/**
	 * This method is to get the Dog object based on the dogid
	 * @param id
	 * @return
	 */
	public Dog getDogByID(int id);

	/**
	 * This method is to get all the lsit of the dogs
	 * @return
	 */
	public List<Dog> getAllDogs();

	/**
	 * This method is to get dog object based on the image url of the dog
	 * @param imageurl
	 * @return
	 */
	public Dog getByImageUrl(String imageurl);

}
