package org.java.develop.dao;

import org.java.develop.model.User;
import org.java.develop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * This Class is implementation of {@link UserDao} interface
 * @author Bhanu
 *
 */
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private UserRepository userRepository;

	/**
	 * This method is to get the User by userName
	 * @param Username
	 * @return
	 */
	@Override
	public User getByUsername(String userName) {

		return (User) userRepository.getByUserName(userName);

	}

}
