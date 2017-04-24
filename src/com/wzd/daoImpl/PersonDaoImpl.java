package com.wzd.daoImpl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Service;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.wzd.dao.BaseDao;
import com.wzd.dao.PersonDao;
import com.wzd.model.Person;

@Service
public class PersonDaoImpl extends BaseDao implements PersonDao {

	@Override
	public Person getPersonById(int id) {
		return (Person) getSqlMapClientTemplate().queryForObject(
				"getPersonById", id);
	}

	@Override
	public int insertPerson(Person person) {
		return (int) getSqlMapClientTemplate().insert("insertPerson", person);
	}

	@Override
	public List<Person> getAll() {
		return getSqlMapClientTemplate().queryForList("getAll");
	}

	@Override
	public void updatePerson(Person person) {
		getSqlMapClientTemplate().update("updatePerson", person);
	}

	@Override
	public void deletePersonById(int id) {
		getSqlMapClientTemplate().delete("deletePersonById", id);
	}

	@Override
	public Person useReusltMap(int id) {
		return (Person) getSqlMapClientTemplate().queryForObject(
				"useResultMap", id);
	}

	@Override
	public Person findById(Person person) {
		return (Person) getSqlMapClientTemplate()
				.queryForObject("findById", person);
	}

}
