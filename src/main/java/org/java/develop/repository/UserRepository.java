package org.java.develop.repository;

import org.java.develop.model.Breed;
import org.java.develop.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * JPA {@link UserRepository} for {@link User} 
 * 
 * @author Bhanu
 *
 */
public interface UserRepository extends CrudRepository<User, Integer> {
	/**
	 * This method is to get User object based on UserName
	 * 
	 * @param userName
	 * @return
	 */
	User getByUserName(String userName);

}
