package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import static combinatorpattern.ValidationResult.*;

// Functional style of programing - Modern way
public interface CustomerValidator extends Function<Customer, ValidationResult>{		

	static CustomerValidator isEmailValid() {
		return customer -> customer.getEmail().contains("@") ?
			SUCCESS : EMAIL_NOT_VAILD;	
	}
	
	static CustomerValidator isPhoneNumberValid() {
		return customer -> customer.getPhoneNumber().startsWith("+0") ?
			SUCCESS : PHONE_NUMBER_NOT_VALID;	
	}
	
	static CustomerValidator isAdult() {
		return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ?
			SUCCESS : NOT_ADULT;	
	}
	
	// ovo  je sustina COMBINATOR PATTERNA !
	default CustomerValidator and (CustomerValidator other) {
		return customer -> {
			ValidationResult result = this.apply(customer);
			return result.equals(SUCCESS) ? other.apply(customer) : result;
		};
	}
}

enum ValidationResult {
	SUCCESS,
	EMAIL_NOT_VAILD,
	PHONE_NUMBER_NOT_VALID,
	NOT_ADULT
}