package com.federal.cdc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.federal.cdc.dao.UserDao;
import com.federal.cdc.model.Login;
import com.federal.cdc.model.User;


@Service
public class UserServiceImpl implements UserService{

	  @Autowired
	  public UserDao userDao;

	  public int register(User user) {
	    return userDao.register(user);
	  }

	  public User validateUser(Login login) {
	    return userDao.validateUser(login);
	  }
	

}
