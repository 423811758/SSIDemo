package com.wzd.dao;

import org.springframework.stereotype.Service;

import com.wzd.model.User;

@Service
public interface UserDao {
	/*
	 * ��¼ pram:userName,passWord return:boolean
	 */
	User login(String userName, String passWord);
}
