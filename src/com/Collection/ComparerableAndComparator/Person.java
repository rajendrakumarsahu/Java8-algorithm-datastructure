package com.Collection.ComparerableAndComparator;

import java.util.Objects;

public class Person {

	public Integer id;
	public String firstName;
	public String secondName;
	public String lastName;

	public Person(Integer id, String firstName, String secondName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		return firstName.hashCode() + secondName.hashCode() + lastName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(secondName, other.secondName)
				&& Objects.equals(lastName, other.lastName);
	}

}
