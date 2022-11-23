package dateapi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatDemo {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		DateFormat d1 = DateFormat.getDateInstance();// default
		String x = d1.format(d);
		System.out.println("Default => " + x);

		d1 = DateFormat.getDateInstance(DateFormat.SHORT);
		x = d1.format(d);
		System.out.println("Short => " + x);

		d1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		x = d1.format(d);
		System.out.println("Medium => " + x);

		d1 = DateFormat.getDateInstance(DateFormat.LONG);
		x = d1.format(d);
		System.out.println("Long => " + x);

		d1 = DateFormat.getDateInstance(DateFormat.FULL);
		x = d1.format(d);
		System.out.println("Full => " + x);

		DateFormat dateShort = DateFormat.getDateInstance(DateFormat.SHORT);
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Date");
		String strDate = scr.next();

		Date ds = dateShort.parse(strDate);
		System.out.println(ds);
		// user date input -> String
		// convert String -> Date
		// DateFormat -> parse()

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter Date");
		strDate = scr.next();
		Date dd = sdf.parse(strDate);
		System.out.println(dd);

	}
}
