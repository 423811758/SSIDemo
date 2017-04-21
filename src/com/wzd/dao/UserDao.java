package com.wzd.dao;

import org.springframework.stereotype.Service;

import com.wzd.model.User;

@Service
public interface UserDao {
	/*
	 * µÇÂ¼ pram:userName,passWord return:boolean
	 */
	User login(String userName, String passWord);
}
