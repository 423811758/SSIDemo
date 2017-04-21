package com.wzd.service;

import java.util.List;

import com.wzd.model.Person;

public interface PersonService {

	Person getPersonById(int id);

	int insertPerson(Person person);

	List<Person> getAll();

	void updatePerson(Person person);

	void deletePersonById(int id);

	Person useReusltMap(int id);

	Person findById(Person person);
}
