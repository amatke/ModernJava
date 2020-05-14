package combinatorpattern;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer("Aleksa", "lexamatovic@gmail.com", "+0381641419419", LocalDate.of(1995, 01, 13));
		
		//System.out.println(new CustomerValidatorService().isValid(customer));
		
		
		ValidationResult res = CustomerValidator.isEmailValid()
									.and(CustomerValidator.isPhoneNumberValid())
									.and(CustomerValidator.isAdult())
									.apply(customer);
		
		System.out.println(res);
	}

}
