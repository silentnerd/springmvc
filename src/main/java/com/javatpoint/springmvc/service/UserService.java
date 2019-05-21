package com.javatpoint.springmvc.service;

import java.util.List;

import com.javatpoint.springmvc.model.User;

public interface UserService {
	 
    User findById(int id);
     
    List<User> findAll();
    
    User save(User user);
     
}
