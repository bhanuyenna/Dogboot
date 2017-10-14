package org.java.develop.Dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.java.develop.Repository.BreedRepository;
import org.java.develop.model.Breed;
import org.java.develop.model.Dog;
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

	/*public List<Dog> getAllDogsByBreed(){
		List<Breed> breed = new ArrayList<>();
		List<Dog> dogbybreed= new ArrayList<>();
		breedRepository.findAll().forEach(breed::add);
		System.out.println("The number of breed are:"+breed.size());
		for(Breed breedobj:breed) {
			breedobj.getDogs().forEach(dogbybreed::add);
			System.out.println("The number ofdogs in breed are:"+breedobj.getDogs().size());
			
		}
		return dogbybreed;
	}*/
	
	
	@Override
	public List<Breed> getAllBreedsbyName(String name) {
		
		return breedRepository.getByBreedName(name);
	}
	
	
}
