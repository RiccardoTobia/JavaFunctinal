package com.zefiro.JavaFunctional.callbacks;

import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		//funzioni callback sono funzioni che vengono mandate come input dentro altre funzioni
		hello("nome", "cognome", null);
		hello("nome", null, value -> System.out.println(value + " non ha cognome"));
		
		hello2("nome", null, () -> System.out.println("non ha cognome"));
	}
	
	static void hello(String name, String surname, Consumer<String> callback) {
		System.out.println(name);
		if(surname != null) {
			System.out.println(surname);
		} else {
			callback.accept(name);
		}
			
	}
	
	//Altro modo per farlo
	static void hello2(String name, String surname, Runnable callback) {
		System.out.println(name);
		if(surname != null) {
			System.out.println(surname);
		} else {
			callback.run();
		}
			
	}
}
