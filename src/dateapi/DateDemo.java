package dateapi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);

		System.out.println(d.getMonth());
		System.out.println(d.getHours());//

		Calendar c = Calendar.getInstance();// abstract

		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.DATE));

		// 2002-> string -> Integer.parseInt()
		// current - year

		// 14-feb-2022 -> Date d => str
		// split -

		DateFormat zd = null; /// format  string -> Date
 		SimpleDateFormat sd = null;

	}
}
