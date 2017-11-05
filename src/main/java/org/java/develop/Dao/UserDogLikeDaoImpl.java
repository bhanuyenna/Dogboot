package org.java.develop.Dao;

import java.util.List;

import org.java.develop.Repository.UserDogLikeRepository;
import org.java.develop.model.Dog;
import org.java.develop.model.User;
import org.java.develop.model.Userdoglike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDogLikeDaoImpl implements UserDogLikeDao {

	@Autowired()
	private UserDogLikeRepository userDogLikeRepository;

	@Override
	public Userdoglike Savedoglike(Userdoglike u) {
		return userDogLikeRepository.save(u);
	}

	@Override
	public List<Userdoglike> listlikes() {
		return (List<Userdoglike>) userDogLikeRepository.findAll();
	}

	@Override
	public Boolean getUserDogLike(Dog dog, User user) {
		Userdoglike userDogLike = userDogLikeRepository.findByDogAndUser(dog, user);
		if (null != userDogLike) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}

	}
}
