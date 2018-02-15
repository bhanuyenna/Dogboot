package org.java.develop.dao;

import java.util.List;

import org.java.develop.model.Dog;
import org.java.develop.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This Class is implementation of {@link DogDao} interface
 * @author Bhanu
 *
 */
@Repository
public class DogDaoImpl implements DogDao {
	@Autowired()
	private DogRepository dogRepository;

	/**
	 * This method is to get the Dog object based on the dogid
	 * @param id
	 * @return
	 */
	@Override
	public Dog getDogByID(int id) {
		Dog dog = (Dog) dogRepository.getByDogId(id);
		return dog;
	}

	/**
	 * This method is to get all the lsit of the dogs
	 * @return
	 */
	@Override
	public List<Dog> getAllDogs() {

		return (List<Dog>) dogRepository.findAll();
	}

	/**
	 * This method is to get dog object based on the image url of the dog
	 * @param imageurl
	 * @return
	 */
	@Override
	public Dog getByImageUrl(String imageurl) {
		Dog doglike = (Dog) dogRepository.getByImageUrl(imageurl);
		// doglike.setDogBreed( this.getDogByID(doglike.getDogid()).getDogBreed());
		doglike.getBreed();
		return doglike;
	}

}
