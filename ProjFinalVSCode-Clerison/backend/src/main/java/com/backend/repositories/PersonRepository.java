package com.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
