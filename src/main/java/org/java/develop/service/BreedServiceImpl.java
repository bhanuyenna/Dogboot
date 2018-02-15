package org.java.develop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.java.develop.dao.BreedDao;
import org.java.develop.model.Breed;
import org.java.develop.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class is service layer for breed Entity 
 * Implemenntation of breeed Service interface
 * 
 * @author Bhanu
 *
 */
@Service
public class BreedServiceImpl implements BreedService {

	@Autowired()
	private BreedDao breedDao;

	/**
	 * This method returns the list of breed objects
	 * 
	 * @return
	 */
	@Override
	public List<Breed> getAllBreeds() {

		List<Breed> breeds = breedDao.getAllBreeds();
		for (Breed b : breeds) {
			List<Dog> dogs = b.getDogs();
			for (Dog d : dogs) {
				d.setCount(d.getUserdoglikes().size());
				d.setDogBreed(d.getBreed().getBreedName());
			}
		}
		return breeds;
	}

	/**
	 * This method returns the list of breed objects
	 * 
	 * @return
	 */
	@Override
	@Transactional
	public Breed getAllBreedsbyName(String name) {
		Breed breedByName = this.breedDao.getBreedbyName(name);
		List<Dog> dogs = breedByName.getDogs();
		for (Dog d : dogs) {
			d.setCount(d.getUserdoglikes().size());
			d.setDogBreed(d.getBreed().getBreedName());
		}
		breedByName.setDogs(dogs);
		return breedByName;
	}

}
