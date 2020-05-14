package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

// zastareli nacin pisanja servisa za npr proveru - ovo je nije Functional java programming style
public class CustomerValidator_Legacy {

	private boolean isEmailValid(String email) {
		return email.contains("@");
	}
	
	private boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("+0");
	}
	
	private boolean isAdult(LocalDate dob) {
		return Period.between(dob, LocalDate.now()).getYears() > 16;
	}
	
	public boolean isValid(Customer customer) {
		return isEmailValid(customer.getEmail()) && isPhoneNumberValid(customer.getPhoneNumber()) && isAdult(customer.getDob());
	}
}
