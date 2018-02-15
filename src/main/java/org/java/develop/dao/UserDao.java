package org.java.develop.dao;

import org.java.develop.model.Breed;
import org.java.develop.model.User;


/**
 * DataAccessObject for {@link UserDao}
 * 
 */
public interface UserDao {
	
	/**
	 * This method is to get the User by userName
	 * @param Username
	 * @return
	 */
	public User getByUsername(String Username);

}
