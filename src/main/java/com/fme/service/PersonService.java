package com.fme.service;

import java.util.List;
import java.util.Optional;

import com.fme.model.Person;

public interface PersonService {
    List<Person> findAll();
    Optional<Person> findById(Long id);
    Person save(Person person);
    void deleteById(Long id);
}