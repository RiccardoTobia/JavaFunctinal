package com.zefiro.JavaFunctional.combinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CiboValidator extends Function<Cibo, ValidationResult>{

	static CiboValidator isCostoso() {
		return cibo -> cibo.getPrezzo() > 5 ? ValidationResult.COSTA_TROPPO : ValidationResult.BUONO;
	}
	
	static CiboValidator isVeg() {
		return cibo -> cibo.isVegetariano() ? ValidationResult.BUONO : ValidationResult.NO_VEG;
	}
	
	static CiboValidator isScaduto() {
		return cibo ->  Period.between(LocalDate.now(), cibo.getScadenza()).isNegative() ? ValidationResult.SCADUTO : ValidationResult.BUONO;
	}
	
	//Implemento l'and. Se tutto va bene continua, sennò restituisce problema
	default CiboValidator and (CiboValidator other) {
		return cibo -> {
			ValidationResult result = this.apply(cibo);
			return result.equals(ValidationResult.BUONO) ? other.apply(cibo) : result;
		};
	}
}
