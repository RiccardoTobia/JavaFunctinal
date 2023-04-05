package com.zefiro.JavaFunctional.combinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CheckService {
	
	//Combination pattern ti permette di combinare funzioni insieme
	//Per usarla a verso però creo interfaccia CiboValiudator

	private boolean isVegetariano(boolean veg) {
		return veg;
	}
	
	private boolean isCostoso(int prezzo) {
		return prezzo > 5;
	}
	
	private boolean isScaduto(LocalDate scadenza) {
		return Period.between(LocalDate.now(), scadenza).isNegative();
	}
	
	public boolean checked(Cibo cibo) {
		return isVegetariano(cibo.isVegetariano()) &&
				isCostoso(cibo.getPrezzo()) &&
				isScaduto(cibo.getScadenza());
	}
}
