package com.zefiro.JavaFunctional.imperative;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Riccardo", Gender.MALE));
		people.add(new Person("Lorenzo", Gender.MALE));
		people.add(new Person("Laura", Gender.FEMALE));

		//Imperative approach => dobbiamo fare tutto noi.
		//Dallo scorrere nella lista, alla verifica, alla 
		// scrittura su schermo della nuova lista
		List<Person> males = new ArrayList<Person>();
		
		for(Person person : people) {
			if(Gender.MALE.equals(person.getGender())) {
				males.add(person);
			}
		}
		
		for (Person person : males) {
			System.out.println(person.toString());
		}
		
	}
}
