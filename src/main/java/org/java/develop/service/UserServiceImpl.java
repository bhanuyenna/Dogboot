package org.java.develop.service;

import org.java.develop.dao.UserDao;
import org.java.develop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class is service layer for User Entity 
 * Implemenntation of UserService interface 
 *
 * @author Bhanu
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public User getByUsername(String userName) {

		return (User) userDao.getByUsername(userName);

	}

}
