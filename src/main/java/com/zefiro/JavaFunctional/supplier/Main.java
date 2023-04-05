package com.zefiro.JavaFunctional.supplier;

public class Main {

	public static void main(String[] args) {
		
//		System.out.println(Fornitore.getDBConnection());
		System.out.println(Fornitore.getDBConnectionSupplier.get());
	}

}
