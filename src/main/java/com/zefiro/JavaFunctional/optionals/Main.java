package com.zefiro.JavaFunctional.optionals;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		//Se null, restituisce il valore del supplier sotto (o comunque fa l'altra azione
//		Object value = Optional.ofNullable(null) 
//			.orElseGet(() -> "value");
//		
//		System.out.println(value);
		
		//Si può mettere anche così
		Optional.ofNullable(null) 
				.ifPresent(valore -> System.out.println(valore)); //o System.out::println
		
		//Stranamente non funziona
//		Optional.ofNullable(null) 
//		.ifPresentOrElse(
//				valore -> System.out.println(valore), 
//				() -> {System.out.println("nada");}
//		); 
				
	}

}
