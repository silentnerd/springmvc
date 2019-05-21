package com.javatpoint.springmvc.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.javatpoint.springmvc.dao.UserDAO;
import com.javatpoint.springmvc.model.User;
	 
	 
	@Service
	@Transactional
	public class UserServiceImpl implements UserService{
	     
	    @Autowired
	    UserDAO userdao;
	     
	    public User findById(int id) {
	        return userdao.findById(id);
	    }
	 
	 
	    public List<User> findAll() {
	        return userdao.findAll();
	    }
	    
	    public void saveUser(User user) {
	        userdao.save(user);
	    }


		public User save(User user) {
			// TODO Auto-generated method stub
			return null;
		}
	}
