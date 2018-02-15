package org.java.develop.repository;

import org.java.develop.model.Dog;
import org.java.develop.model.User;
import org.java.develop.model.Userdoglike;
import org.springframework.data.repository.CrudRepository;

public interface UserdoglikeRepository extends CrudRepository<Userdoglike, Integer> {

	Dog getByDog(Dog dog);

	User getByUser(User user);

	Userdoglike findByDogAndUser(Dog dog, User user);


}
