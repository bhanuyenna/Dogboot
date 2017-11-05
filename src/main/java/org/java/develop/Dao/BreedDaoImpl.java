package org.java.develop.Dao;

import java.util.List;

import org.java.develop.Repository.BreedRepository;
import org.java.develop.model.Breed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BreedDaoImpl implements BreedDao {
	@Autowired()
	private BreedRepository breedRepository;

	@Override
	public List<Breed> getAllBreeds() {
		return (List<Breed>) breedRepository.findAll();
	}

	@Override
	public List<Breed> getAllBreedsbyName(String name) {

		return breedRepository.getByBreedName(name);
	}

}
