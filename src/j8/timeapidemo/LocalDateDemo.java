package j8.timeapidemo;

import java.time.LocalDate;
import java.util.Scanner;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDate yest = date.minusDays(1);
		System.out.println(yest);

		LocalDate datom = date.plusDays(2);
		System.out.println(datom);

//		LocalDate dob = new LocalDate(2000,12,1);

		LocalDate dob = LocalDate.of(2000, 12, 1);
		System.out.println(dob);
		System.out.println(dob.isLeapYear());

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter your dob (yyyy-mm-dd)");
		String dobStr = scr.next();

		LocalDate dobNew = LocalDate.parse(dobStr);
		System.out.println(dobNew);

	}
}
