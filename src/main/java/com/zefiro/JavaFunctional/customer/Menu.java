package com.zefiro.JavaFunctional.customer;

public class Menu {

	private final String piatto;
	private final int prezzo;
	
	public Menu(String piatto, int prezzo) {
		super();
		this.piatto = piatto;
		this.prezzo = prezzo;
	}
	
	public String getPiatto() {
		return piatto;
	}

	public int getPrezzo() {
		return prezzo;
	}
}

