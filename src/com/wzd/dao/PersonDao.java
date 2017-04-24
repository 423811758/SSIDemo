package com.wzd.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wzd.model.Person;

public interface PersonDao {

	Person getPersonById(int id);

	int insertPerson(Person person);

	List<Person> getAll();

	void updatePerson(Person person);

	void deletePersonById(int id);

	Person useReusltMap(int id);

	Person findById(Person person);
}
