package com.yk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.yk.entity.Todo;
import com.yk.entity.User;
import com.yk.repo.UserRepo;
@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepo repo;
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}

	@Override
	public User getUserbyId(int uid) {
		// TODO Auto-generated method stub
		
		return repo.findById(uid).get();
				}

	@Override
	public void saveUser(User u) {
		// TODO Auto-generated method stub

		repo.save(u);
		
		
	}
	
	

	@Override
	public User findByUserId(int uid) {
		// TODO Auto-generated method stub
		return repo.findById(uid).get();
	}

}
