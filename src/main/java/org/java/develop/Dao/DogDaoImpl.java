package org.java.develop.Dao;

import java.util.List;

import org.java.develop.Repository.DogRepository;
import org.java.develop.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DogDaoImpl implements DogDao {
	@Autowired()
	private DogRepository dogRepository;

	@Override
	public Dog getDogByID(int id) {
		Dog dog =  (Dog) dogRepository.getByDogid(id) ;
		return dog;
	}

	@Override
	public List<Dog> getAllDogs() {
		
		return (List<Dog>) dogRepository.findAll();
	}
	
	

}
