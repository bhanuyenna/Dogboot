package org.java.develop.dao;

import org.java.develop.model.User;
import org.java.develop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User getByUsername(String userName) {

		return (User) userRepository.getByUserName(userName);

	}

}
