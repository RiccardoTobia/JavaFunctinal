package com.zefiro.JavaFunctional.combinatorPattern;

import java.time.LocalDate;

public class Cibo {

	private final String nome;
	private final int prezzo;
	private final boolean vegetariano;
	private final LocalDate scadenza;
	
	public Cibo(String nome, int prezzo, boolean vegetariano, LocalDate scadenza) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.vegetariano = vegetariano;
		this.scadenza = scadenza;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getPrezzo() {
		return prezzo;
	}
	
	public boolean isVegetariano() {
		return vegetariano;
	}

	public LocalDate getScadenza() {
		return scadenza;
	}
}
