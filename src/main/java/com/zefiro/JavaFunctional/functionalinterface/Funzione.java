package com.zefiro.JavaFunctional.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Funzione {
	//Scrivo metodo sotto come Function, in modo da scriverla come lambda
	//Primo argomento è input, secondo è outuput
	static Function<Integer, Integer> funzioneAumentoDiUno = number -> number+1;
	
	//Per combinazione funzioni
	static Function<Integer, Integer> funzioneQuadrato = number -> number*number;
	
	//Combinate ===>
	static Function<Integer, Integer> addAndElevate = funzioneAumentoDiUno.andThen(funzioneQuadrato);
	
	public static int increment (int number) {
		return number +1;
	}
	
	//Bifunctions: 2 input e 1 output
	
	//intanto scriviamo come sarebbe la funzione imperative
	public static int addTheTwoAndElevete(int a, int b) {
		return (int) Math.pow(a+b, 2);
	}
	
	//Con Bifunction
	static BiFunction<Integer, Integer, Integer> BiAddElevete = (a, b) ->  (int) Math.pow(a+b, 2);
	
}
