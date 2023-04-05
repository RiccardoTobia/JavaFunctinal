package com.zefiro.JavaFunctional.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import com.zefiro.JavaFunctional.imperative.Gender;
import com.zefiro.JavaFunctional.imperative.Person;

public class Main {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Riccardo", Gender.MALE));
		people.add(new Person("Lorenzo", Gender.MALE));
		people.add(new Person("Laura", Gender.FEMALE));
		
		//Vediamo stream meglio ==> si va nell'abstraction mode
		//Una volta entrati. ci sono diversi metodi che possiamo
		//usare.
		
		people.stream()
				.map(person -> person.getGender()) //Con map abbiamo convertito in lista di generi
				.collect(Collectors.toSet()) // collezioniamo in set, rimuovendo i doppioni
				.forEach(gender -> System.out.println(gender));

		//Posso fare diverse cose, tipo:
		//Creo funzione per map per convertire ogni elemento in suo nome e
		//altra oer convertire nome in sua lunghezza. Poi scrivo tutto
//		Function<Person, String> personToName = person -> person.getName();
//		ToIntFunction<String> length = String::length;
//		
//		people.stream().map(personToName).mapToInt(length).forEach(System.out::println);
	
		//Altro è allMatch per controllare se TUTTI gli elementi soddisfano condizione predicato
		boolean allFemales = people.stream().allMatch(person -> Gender.FEMALE.equals(person.getGender()));
		System.out.println(allFemales);
		//Ci sono anche anyMatch e nonMatch
	}

}
