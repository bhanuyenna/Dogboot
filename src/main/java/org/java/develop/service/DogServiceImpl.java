package org.java.develop.service;


import org.java.develop.Dao.DogDao;
import org.java.develop.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogServiceImpl implements DogService {

	@Autowired
	private DogDao dogDao;
	
	@Override
	public Dog getByDogId(int id) {
		Dog d=dogDao.getDogByID(id);
		d.setCount(d.getUserdoglikes().size());
		
		return d  ;
	}

	
}
