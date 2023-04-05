package com.zefiro.JavaFunctional.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicato {

	//innanzitutto vediamo l'imperativo
	public static boolean gmail(String mail) {
		return mail.contains("gmail");
	}
	
	//Vediamo functional
	static Predicate<String> prGmail = mail -> mail.contains("gmail");
	
	static Predicate<String> prLenght = mail -> mail.length() >= 10;
	
	static BiPredicate<String, String> login = (mail, psw) -> mail.equals("mail") && psw.equals("psw");
 }
