package task.expmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class ExpenseController {

	public static void main(String[] args) {
		int choice;
		Random r = new Random();

		Scanner scr = new Scanner(System.in);
		List<UserBean> users = new ArrayList<UserBean>();
		List<ExpenseBean> expenses = new ArrayList<ExpenseBean>();
		UserBean currentUser = null;
		while (true) {
			System.out.println("\n1 For Signup\n2 For Login\n3 For Exit");
			System.out.println("Enter your choice:: ");
			choice = scr.nextInt();

			switch (choice) {
			case 1: // signup
				UserBean user = new UserBean();
				user.signup();
				users.add(user);
				System.out.println("Signup successfully done....");
				break;
			case 2: // login
				System.out.println("Enter username and password?");
				String uname = scr.next();
				String pwd = scr.next();

				// Java 8-> Optional
				Optional<UserBean> optional = users.stream().filter(u -> u.login(uname, pwd)).findFirst();
				if (optional.isPresent()) {
					currentUser = optional.get();
					System.out.println("Welcome , " + currentUser.getFirstName());
					// submenu

				} else {
					System.out.println("Invalid Credentials...");
				}
				break;
			case 3:
				System.out.println("Thank you for using our service...");
				System.exit(0);
			}// main switch
		} // main while
	}// main method
}// ExpenseController
