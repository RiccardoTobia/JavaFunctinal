package com.zefiro.JavaFunctional.customer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		Menu piatto = new Menu("pasta e fazule", 4);
//		ordinare(piatto);
		
		//Come lo faccio in modo più funzionale? Con consumer
		consOrdinare.accept(piatto);
		
		//Con Biconsumer
		biConsordinare.accept(piatto, Bontà.BUONO);
	}
	
	static void ordinare(Menu piatto) {
		String ordinazione = String.format("Hai ordinato %s che costa %s", piatto.getPiatto(), piatto.getPrezzo());
		System.out.println(ordinazione);
	} 
	
	static Consumer<Menu> consOrdinare = piatto -> System.out.println(String.format("Hai ordinato %s che costa %s", piatto.getPiatto(), piatto.getPrezzo()));
	
	//BiConsumer
	static BiConsumer<Menu, Bontà> biConsordinare = (piatto, bontà) -> 
	System.out.println(String.format("Hai ordinato %s che costa %s ed è %s", piatto.getPiatto(), piatto.getPrezzo(), bontà));
}
