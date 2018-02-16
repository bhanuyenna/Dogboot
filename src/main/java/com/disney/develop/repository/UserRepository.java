package com.disney.develop.repository;

import org.springframework.data.repository.CrudRepository;

import com.disney.develop.model.Breed;
import com.disney.develop.model.User;

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
