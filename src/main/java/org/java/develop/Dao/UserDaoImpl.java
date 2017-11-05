package org.java.develop.Dao;

import org.java.develop.Repository.UserRepository;
import org.java.develop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User getByUsername(String userName) {

		return (User) userRepository.getByUsername(userName);

	}

}
