package com.zefiro.JavaFunctional.imperative;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Riccardo", Gender.MALE));
		people.add(new Person("Lorenzo", Gender.MALE));
		people.add(new Person("Laura", Gender.FEMALE));

		//Imperative approach
		List<Person> females = new ArrayList<Person>();
		
		for(Person person : people) {
			if(Gender.FEMALE.equals(person.getGender())) {
				females.add(person);
			}
		}
		
		for (Person person : females) {
			System.out.println(person.toString());
		}
	}
}
