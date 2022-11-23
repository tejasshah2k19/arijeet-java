package exceptiond;

import java.util.Scanner;

public class GmailApi {
	void signup(String email, String password) throws PasswordStrengthException {
		if (password.length() >= 3) {
			System.out.println("signup()");
		} else {
			// below line will generate an exception
			throw new PasswordStrengthException("Please Enter more than 3 alpha numeric value in password");
		}
	}
	void login(String email, String password) {
		if (email.contains("@gmail.com")) {
			System.out.println("login()");
		} else {
			// below line will generate an exception
			throw new InvalidEmailException();
		}
	}
}
//ORA-90001 
//unchecked 
class InvalidEmailException extends RuntimeException {
	public InvalidEmailException() {
		super("Invalid Email");
	}
}
//checked 
class PasswordStrengthException extends Exception {
	public PasswordStrengthException() {
		super("Please Provide Strong Password");
	}

	public PasswordStrengthException(String msg) {
		super(msg);
	}
}
