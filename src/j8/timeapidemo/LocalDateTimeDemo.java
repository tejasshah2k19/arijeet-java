package j8.timeapidemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime t1 = LocalDateTime.now(); // Date Time
		System.out.println(t1); // date time

		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MMMM-yyy");
		String newDate = t1.format(f);
		System.out.println(newDate);

		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd-MMMM-yyy HH:mm:ss");
		String newDate2 = t1.format(f2);
		System.out.println(newDate2);

		System.out.println(t1.get(ChronoField.DAY_OF_MONTH));

		System.out.println(t1.get(ChronoField.MONTH_OF_YEAR));

	}
}
