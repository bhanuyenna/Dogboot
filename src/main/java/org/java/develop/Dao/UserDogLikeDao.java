package org.java.develop.Dao;

import java.util.List;

import org.java.develop.model.Dog;
import org.java.develop.model.User;
import org.java.develop.model.Userdoglike;

public interface UserDogLikeDao {
	public Userdoglike Savedoglike(Userdoglike u);

	public List<Userdoglike> listlikes();

	public Boolean getUserDogLike(Dog d, User user);

}
