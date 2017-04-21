package com.wzd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzd.dao.PersonDao;
import com.wzd.model.Person;
import com.wzd.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;

	@Override
	public Person getPersonById(int id) {
		return personDao.getPersonById(id);
	}

	@Override
	public int insertPerson(Person person) {
		return personDao.insertPerson(person);
	}

	@Override
	public List<Person> getAll() {
		return personDao.getAll();
	}

	@Override
	public void updatePerson(Person person) {
		personDao.updatePerson(person);
	}

	@Override
	public void deletePersonById(int id) {
		personDao.deletePersonById(id);
	}

	@Override
	public Person useReusltMap(int id) {
		return personDao.useReusltMap(id);
	}

	@Override
	public Person findById(Person person) {
		return personDao.findById(person);
	}

}
