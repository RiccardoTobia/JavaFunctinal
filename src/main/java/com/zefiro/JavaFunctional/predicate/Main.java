package com.zefiro.JavaFunctional.predicate;

public class Main {

	public static void main(String[] args) {
//		System.out.println(Predicato.gmail("sddfsf@.com"));
		System.out.println(Predicato.prGmail.test("asfdafsd@gmail.com"));
		System.out.println(Predicato.prLenght.test("asfdafsd"));
		
		System.out.println(Predicato.login.test("mail", "psw1") ? "login effettuato" : "login sbagliato");
	}
}
