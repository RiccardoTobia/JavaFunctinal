package com.zefiro.JavaFunctional.combinatorPattern;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Cibo cibo = new Cibo("saikebon", 5, false, LocalDate.of(2023, 12, 5));
		
//		CheckService service = new CheckService();
//		
//		System.out.println(service.checked(cibo));
		
		ValidationResult result = CiboValidator.isCostoso()
					.and(CiboValidator.isVeg())
					.and(CiboValidator.isScaduto()).apply(cibo);
		
		System.out.println(result);
	}

}
