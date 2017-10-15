package org.java.develop.Repository;


import java.util.List;

import org.java.develop.model.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	Dog getByDogid(int dogid);

}
