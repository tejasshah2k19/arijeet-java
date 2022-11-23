package dateapi;

import java.util.Calendar;
import java.util.Date;

public class CalDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		// getInstance()
		// CalendarProvider

		System.out.println(c);
		// how to get individual value from calendar object ?
		// we have get()
		System.out.println(c.get(Calendar.MONTH)); // month starts from 0->jan
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c.get(Calendar.DST_OFFSET));
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));

		// Recharge 30 days 25 days 86 days

		c.add(Calendar.DATE, 86);// this will add 86 days in
									// current calendar object which is c

		// Date d = new Date(1000*60*60*24);
		// System.out.println(d);//Thu Jan 01 05:30:00 IST 1970
		// System.out.println(d);

		Date d = new Date(c.getTimeInMillis());
		System.out.println(d);
	}
}
