package com.javatpoint.springmvc.dao;

import java.util.List;

import com.javatpoint.springmvc.model.User;

public interface UserDAO {
	 
    List<User> findAll();
     
    User findById(int id);
    
    void save(User user);
    
    
    
    
}