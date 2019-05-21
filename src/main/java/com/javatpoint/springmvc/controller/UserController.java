package com.javatpoint.springmvc.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javatpoint.springmvc.model.User;
import com.javatpoint.springmvc.service.UserService;
@Controller
public class UserController {
	@Autowired
    UserService userService;
	
	@RequestMapping("/hello")
		public String redirect()
		{
			return "viewpage";
		}	
	
	@RequestMapping(value="/createUser", method = RequestMethod.POST)
	public String createUser(HttpServletRequest req)
	{
		//Read the provided form data  
	    String fname=req.getParameter("fname");  
	    String lname=req.getParameter("lname");
	    
        User user = new User();
        user.setFname(fname);
        user.setLname(lname);
        userService.save(user);
	    
		return "Successfuly user created";  
	   
	}
}
