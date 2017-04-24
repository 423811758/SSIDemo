package com.wzd.daoImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.wzd.dao.BaseDao;
import com.wzd.dao.UserDao;
import com.wzd.model.User;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao {

	@Override
	public User login(String name, String password) {
		Map<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("password", password);
		return (User) getSqlMapClientTemplate().queryForObject("findByNameAndPassword", map);
	}

}
