package exceptiond;

import java.util.Scanner;

public class RoyalEdu {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.println("Enter email and password");
		String email = scr.next();
		String password = scr.next();

		GmailApi gmail = new GmailApi();

		try {
			gmail.login(email, password);
		} catch (InvalidEmailException e) {
			System.out.println(e.getMessage());
		}

		try {
			gmail.signup(email, password);
		} catch (PasswordStrengthException e) {
			e.printStackTrace();
		}

	}
}
