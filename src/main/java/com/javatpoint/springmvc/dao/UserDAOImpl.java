package com.javatpoint.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.javatpoint.springmvc.model.User;

@Repository()
public abstract class UserDAOImpl extends AbstractDAO<Integer, User>implements UserDAO{
 
    public User findById(int id) {
        return getByKey(id);
    }
     
    @SuppressWarnings("unchecked")
    public List<User> findAll(){
        Criteria crit = createEntityCriteria();
        crit.addOrder(Order.asc("fname"));
        return (List<User>)crit.list();
    }
    
    public void save(User user) {
        persist(user);
    }
     
}

