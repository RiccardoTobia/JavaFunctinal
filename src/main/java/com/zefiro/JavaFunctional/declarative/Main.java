package com.zefiro.JavaFunctional.declarative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.zefiro.JavaFunctional.imperative.Gender;
import com.zefiro.JavaFunctional.imperative.Person;

public class Main {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Riccardo", Gender.MALE));
		people.add(new Person("Lorenzo", Gender.MALE));
		people.add(new Person("Laura", Gender.FEMALE));

		//declarative approach => Uso streams e collezioni
		//Passo a "abstract mode" con stream (serve per abilitare functional programming,
		//per filtrare people in base al genere, poi colleziono in lista
		//e faccio foreach
//		people.stream().filter(person -> Gender.FEMALE.equals(person.getGender()))
//		.collect(Collectors.toList()).forEach(System.out::println);
		
		//lo posso scrivere come predicate (boolean valued fuction)
		Predicate<Person> pPredicate = person -> Gender.FEMALE.equals(person.getGender());
		people.stream().filter(pPredicate)
		.collect(Collectors.toList()).forEach(System.out::println);
		//posso fare anche in modo + imperativo
//		List<Person> females = people.stream().filter(pPredicate)
//		.collect(Collectors.toList());
//		females.forEach(System.out::println);
	}

}
