package org.java.develop.Repository;

import org.java.develop.model.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	Dog getByDogId(int dogId);

	Dog getByImageUrl(String imageUrl);

}
