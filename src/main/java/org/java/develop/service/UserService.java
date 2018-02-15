package org.java.develop.service;

import org.java.develop.model.User;

/**
 * This interface is service layer for breed Entity
 * 
 * @author Bhanu
 *
 */
public interface UserService {
	public User getByUsername(String username);

}
