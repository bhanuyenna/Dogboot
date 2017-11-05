package org.java.develop.Repository;

import org.java.develop.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
	User getByUsername(String username);

}
