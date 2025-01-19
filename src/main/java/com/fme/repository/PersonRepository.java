package com.fme.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fme.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
