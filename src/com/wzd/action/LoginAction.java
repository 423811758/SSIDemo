package com.wzd.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wzd.dao.PersonDao;
import com.wzd.dao.UserDao;
import com.wzd.daoImpl.PersonDaoImpl;
import com.wzd.daoImpl.UserDaoImpl;
import com.wzd.model.Person;
import com.wzd.service.PersonService;
import com.wzd.service.UserService;

@Controller
public class LoginAction extends ActionSupport {

	@Autowired(required = true)
	private UserService userService;
	@Autowired(required = true)
	private PersonService personService;
	private String username;
	private String password;
	private List<Person> persons;

	public String execute() throws Exception {
		if (userService.login(username, password)) {
			ActionContext.getContext().getSession().put("user", getUsername());
//			Person person = new Person();
//			person.setAge(25);
//			person.setName("aaaaa");
//			person.setSex("男");
//			int id = personService.insertPerson(person);
//			person.setId(id);
//			person.setAge(30);
//			person.setName(person.getName() + id);
//			personService.updatePerson(person);
//			persons = personService.getAll();
//			System.out.println("size: " + persons.size());
////			personService.deletePersonById(persons.get(0).getId());
//			System.out.println("id: "
//					+ personService.useReusltMap(id).getName() + "; id: "
//					+ personService.findById(person).getName());
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}