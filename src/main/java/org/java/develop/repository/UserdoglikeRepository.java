package org.java.develop.repository;

import org.java.develop.model.Breed;
import org.java.develop.model.Dog;
import org.java.develop.model.User;
import org.java.develop.model.Userdoglike;
import org.springframework.data.repository.CrudRepository;

/**
 * JPA {@link UserdoglikeRepository} for {@link Userdoglike} 
 * 
 * @author Bhanu
 *
 */
public interface UserdoglikeRepository extends CrudRepository<Userdoglike, Integer> {

	/**
	 * This method is to get the dog based on the input
	 * @param dog
	 * @return
	 */
	Dog getByDog(Dog dog);

	/**
	 * This method is to get the User based on the input
	 * @param user
	 * @return
	 */
	User getByUser(User user);

	/**
	 * This method get the likes for a dog given by a user
	 * 
	 * @param d
	 * @param user
	 * @return
	 */
	Userdoglike findByDogAndUser(Dog dog, User user);


}
