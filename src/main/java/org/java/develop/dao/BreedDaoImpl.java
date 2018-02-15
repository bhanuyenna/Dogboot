package org.java.develop.dao;

import java.util.List;

import org.java.develop.model.Breed;
import org.java.develop.repository.BreedRepository;
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
	public Breed getBreedbyName(String name) {

		return breedRepository.getByBreedName(name);
	}

}
