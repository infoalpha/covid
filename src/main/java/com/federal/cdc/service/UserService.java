package com.federal.cdc.service;

import java.util.List;


import com.federal.cdc.model.Login;
import com.federal.cdc.model.User;

public interface UserService {
	int register(User user);

	User validateUser(Login login);

}
