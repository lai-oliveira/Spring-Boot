package com.api_rest.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api_rest.projeto.models.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

}