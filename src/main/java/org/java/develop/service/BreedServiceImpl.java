package org.java.develop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.java.develop.Dao.BreedDao;
import org.java.develop.model.Breed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BreedServiceImpl implements BreedService {

	@Autowired()
	private BreedDao breedDao;
	
	@Override
	public List<Breed> getAllBreeds() {
		
		List<Breed>breed  = breedDao.getAllBreeds();
		System.out.println(breed);
		return breed;
	}

	@Override
	@Transactional
	public List<Breed> getAllBreedsbyName(String name) {
		return this.breedDao.getAllBreedsbyName(name);
	}

	@Override
	public void gethome() {;
	}

//	@Override
//	public List<Dog> getAllDogsByBreed() {
//		
//		return this.breedDao.getAllDogsByBreed();
//	}

}
