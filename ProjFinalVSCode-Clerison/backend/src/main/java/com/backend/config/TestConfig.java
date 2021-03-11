package com.backend.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.backend.entities.Person;
import com.backend.repositories.PersonRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	
	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Person p1 = new Person(1L, "Pessoa Número Um", "Rua das Avenidas", "112233", "5581911112222", "pessoa1@email.com");
		Person p2 = new Person(2L, "Pessoa Número Dois", "Avenida das Ruas", "445566", "5581922223333", "pessoa2@email.com");
		personRepository.saveAll(Arrays.asList(p1, p2));

	}
}
