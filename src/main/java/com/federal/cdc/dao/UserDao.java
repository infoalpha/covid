package com.federal.cdc.dao;


import com.federal.cdc.model.Login;
import com.federal.cdc.model.User;


public interface UserDao 
{
	  int register(User user);

	  User validateUser(Login login);
}