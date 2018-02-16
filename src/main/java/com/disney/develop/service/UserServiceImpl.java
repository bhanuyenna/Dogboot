package com.disney.develop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disney.develop.dao.UserDao;
import com.disney.develop.model.User;

/**
 * This class is service layer for User Entity Implemenntation of UserService
 * interface
 *
 * @author Bhanu
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	/**
	 * This method is to get the User by userName
	 * @param Username
	 * @return
	 */
	@Override
	public User getByUsername(String userName) {

		return (User) userDao.getByUsername(userName);

	}

	/**
	 * This method is used to save the User data
	 * 
	 * @param user
	 * @return
	 */
	@Override
	public User saveUser(User user) {
		if(user == null) {
			return null;
		}
		return userDao.saveUser(user);
	}

	/**
	 * Delete the user based on userName
	 * 
	 * @param userName
	 */
	@Override
	public void deleteUser(String userName) {
		
		
		userDao.deleteUser(userName);

	}

}
