package com.zefiro.JavaFunctional.supplier;

import java.util.function.Supplier;

public class Fornitore {

	public static String getDBConnection() {
		return "string connessione";
	}
	
	public static Supplier<String> getDBConnectionSupplier = 
			() -> "stringa connessione db";
}
