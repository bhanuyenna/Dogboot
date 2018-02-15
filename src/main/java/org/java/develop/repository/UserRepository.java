package org.java.develop.repository;

import org.java.develop.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
	User getByUserName(String userName);

}
