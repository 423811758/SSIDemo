package com.wzd.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.opensymphony.xwork2.ActionSupport;
import com.wzd.model.Person;
import com.wzd.service.PersonService;

@Controller
public class PersonAction extends ActionSupport {

	private int id;
	@Autowired
	private PersonService personService;
	private List<Person> persons;

	public String deletePersonByName() {
		personService.deletePersonById(id);
		persons = personService.getAll();
		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

}
