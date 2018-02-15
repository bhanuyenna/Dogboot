package org.java.develop.service;

import java.util.List;

import org.java.develop.dao.DogDao;
import org.java.develop.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class is service layer for DOg Entity 
 * Implemenntation of Dog Service interface
 * 
 * @author Bhanu
 *
 */
@Service
public class DogServiceImpl implements DogService {

	@Autowired
	private DogDao dogDao;

	@Override
	public Dog getByDogId(int id) {
		Dog d = dogDao.getDogByID(id);
		d.setCount(d.getUserdoglikes().size());
		d.setDogBreed(d.getBreed().getBreedName());

		return d;
	}

	@Override
	public List<Dog> getAllDogs() {
		List<Dog> dogs = dogDao.getAllDogs();

		for (Dog d : dogs) {
			d.setCount(d.getUserdoglikes().size());
			d.setDogBreed(d.getBreed().getBreedName());
		}
		dogs.sort(new DogComparator());
		return dogs;
	}

	@Override
	public Dog getDogByImageUrl(String imageurl) {
		Dog dogbyimage = (Dog) dogDao.getByImageUrl(imageurl);
		return dogbyimage;
	}

}
