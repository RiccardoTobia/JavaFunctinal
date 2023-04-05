package com.zefiro.JavaFunctional.imperative;

public class Person {

	private  final String name;
	private final Gender gender;
	public Person(String name, Gender gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	public String getName() {
		return name;
	}
	public Gender getGender() {
		return gender;
	}
	
	
}

enum Gender {
	MALE, FEMALE, OTHER
}