package org.java.develop.Repository;

import java.util.List;

import org.java.develop.model.Breed;
import org.springframework.data.repository.CrudRepository;

public interface BreedRepository extends CrudRepository<Breed, Integer> {
	List<Breed> getByBreedName(String breed);

}
