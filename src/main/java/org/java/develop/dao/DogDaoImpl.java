package org.java.develop.dao;

import java.util.List;

import org.java.develop.model.Dog;
import org.java.develop.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DogDaoImpl implements DogDao {
	@Autowired()
	private DogRepository dogRepository;

	@Override
	public Dog getDogByID(int id) {
		Dog dog = (Dog) dogRepository.getByDogId(id);
		return dog;
	}

	@Override
	public List<Dog> getAllDogs() {

		return (List<Dog>) dogRepository.findAll();
	}

	@Override
	public Dog getByImageUrl(String imageurl) {
		Dog doglike = (Dog) dogRepository.getByImageUrl(imageurl);
		// doglike.setDogBreed( this.getDogByID(doglike.getDogid()).getDogBreed());
		doglike.getBreed();
		return doglike;
	}

}
