package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Khaled");
		p.setLastName("Amrosy");
		persons.add(p);

		p = new Person();
		p.setId("2");
		p.setAge(25);
		p.setFirstName("Mohammed");
		p.setLastName("Shalaby");
		persons.add(p);
		
		p = new Person();
		p.setId("3");
		p.setAge(25);
		p.setFirstName("Basem");
		p.setLastName("Salama");
		persons.add(p);
		
		p = new Person();
		p.setId("4");
		p.setAge(25);
		p.setFirstName("AbdulHalim");
		p.setLastName("Mahmoud");
		persons.add(p);
		
		
		p = new Person();
		p.setId("5");
		p.setAge(50);
		p.setFirstName("AbdulHalim");
		p.setLastName("Hamza");
		persons.add(p);
		
		p = new Person();
		p.setId("6");
		p.setAge(100);
		p.setFirstName("Aziz");
		p.setLastName("Hamza");
		persons.add(p);
		
		p = new Person();
		p.setId("7");
		p.setAge(20);
		p.setFirstName("test");
		p.setLastName("webh");
		persons.add(p);
		
		p = new Person();
		p.setId("8");
		p.setAge(40);
		p.setFirstName("test2");
		p.setLastName("webh2");
		persons.add(p);
		
		p = new Person();
		p.setId("9");
		p.setAge(40);
		p.setFirstName("docker");
		p.setLastName("webh");
		persons.add(p);
		
		p = new Person();
		p.setId("10");
		p.setAge(40);
		p.setFirstName("docker2");
		p.setLastName("webh2");
		persons.add(p);
		
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}

