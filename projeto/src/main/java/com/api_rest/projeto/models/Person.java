package com.api_rest.projeto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

	@GeneratedValue
	@Id
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	
	
	public Person() {
}

	public Person (String name, int age) {
	super();
	this.name = name;
	this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
        return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
	    return age;
	}
	
	public void setAge(int age) {
		this.age = age ;
	}
	public String toString() {
		return name;
		
	
    }
}	
