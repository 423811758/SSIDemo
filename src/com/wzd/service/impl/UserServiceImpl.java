package com.wzd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzd.dao.UserDao;
import com.wzd.model.User;
import com.wzd.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean login(String name, String password) {
		User user = userDao.login(name, password);
		if (user != null) {
			return true;
		} else {
			return false;
		}

//		if ("wzd".equals(name) && "123456".equals(password)) {
//			return true;
//		} else {
//			return false;
//		}
	}

}
