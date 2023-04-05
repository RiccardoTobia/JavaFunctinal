package com.zefiro.JavaFunctional.functionalinterface;

public class Main {

	public static void main(String[] args) {
		int increment = Funzione.increment(0);
		System.out.println(increment);
		
		int increment2 = Funzione.funzioneAumentoDiUno.apply(1);
		System.out.println(increment2);
		
		//Con function posso fare diverse cose, ecco peché
		//possono essere comode. Tipo posso combinare funzioni
		//invece di fare così
		//int incrAlQuadrato = Funzione.funzioneQuadrato.apply(increment2);
		//Posso fare:
		 int womboCombo = Funzione.addAndElevate.apply(2);
		 System.out.println(womboCombo);
		 
		 
		 //BiFunction
//		 System.out.println(Funzione.addTheTwoAndElevete(1, 2));
		 
		 int bi = Funzione.BiAddElevete.apply(10, 2);
		 System.out.println(bi);
	}

}
