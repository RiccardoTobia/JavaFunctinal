package com.zefiro.JavaFunctional.callbacks;

import java.util.function.Function;

public class Lambdas {

	public static void main(String[] args) {
//		Function<String, String> printName = name -> name.toUpperCase();
		Function<String, String> toUpperCase = name ->{
			if(name.isEmpty()) throw new IllegalArgumentException();
			return name.toUpperCase();
		};	
	}
}
