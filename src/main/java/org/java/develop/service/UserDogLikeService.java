package org.java.develop.service;

import org.java.develop.model.Userdoglike;

public interface UserDogLikeService {

	public Userdoglike saveDogLike(String username, String imageurl,Boolean isLike);
}
