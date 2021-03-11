package com.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.entities.Person;
import com.backend.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public List<Person> findAll() {
		return personRepository.findAll();
	}
	
	public Person findById(Long id) {
		Optional<Person> person = personRepository.findById(id);
		return person.get();
	}
	
	public Person insert(Person person) {
		return personRepository.save(person);
	}
	
	public void delete(Long id) {
		personRepository.deleteById(id);
	}
	
	public Person update(Long id, Person person) {
		Person obj = personRepository.getOne(id);
		updateData(obj, person);
		return personRepository.save(obj);
	}

	private void updateData(Person obj, Person person) {
		obj.setFullName(person.getFullName());
		obj.setAddress(person.getAddress());
		obj.setDocument(person.getDocument());
		obj.setPhone(person.getPhone());
		obj.setEmail(person.getEmail());
	}
}
