package com.yk.service;

import java.util.List;

import com.yk.entity.User;


public interface UserService {

List<User> getAllUser();
    
    User getUserbyId(int uid);
    
    void saveUser(User u);
    
    User findByUserId(int uid);
    
	
}
