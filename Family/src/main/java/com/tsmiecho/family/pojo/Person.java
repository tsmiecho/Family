package com.tsmiecho.family.pojo;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String surname;
	
	@ManyToOne
	@JoinColumn(name = "persons")
	private Adress birthAdress;
	
	private Date dateOfBirth;
	
	private Date dateOfDeath;
	
	@ManyToMany
	@JoinColumn(name = "children")
	private Set<Person> parents;
	
	@ManyToMany
	@JoinColumn(name = "parents")
	private Set<Person> children;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfDeath() {
		return dateOfDeath;
	}

	public Adress getBirthAdress() {
		return birthAdress;
	}

	public void setBirthAdress(Adress birthAdress) {
		this.birthAdress = birthAdress;
	}

	public Set<Person> getParents() {
		return parents;
	}

	public void setParents(Set<Person> parents) {
		this.parents = parents;
	}

	public Set<Person> getChildren() {
		return children;
	}

	public void setChildren(Set<Person> children) {
		this.children = children;
	}

	public void setDateOfDeath(Date dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	
}
