package org.java.develop.repository;

import org.java.develop.model.Breed;
import org.springframework.data.repository.CrudRepository;

public interface BreedRepository extends CrudRepository<Breed, Integer> {
	Breed getByBreedName(String breed);

}
