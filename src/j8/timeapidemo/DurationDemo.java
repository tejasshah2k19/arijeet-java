package j8.timeapidemo;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DurationDemo {
	public static void main(String[] args) {
		LocalTime h1 = LocalTime.now();// 12.00.15.120

		LocalTime h2 = LocalTime.now().plusSeconds(120);// 18.01.58.340.120 //18.01.58.340.121

//		h1.plusNanos(1000000000 * 33);// 18.01.58.340.120 //18.01.58.340.121
		System.out.println("h1 => " + h1);
		System.out.println("h2 => " + h2);

		Duration d = Duration.between(h1, h2); // second | nano second
		System.out.println("d => " + d);
//		System.out.println(d.get(ChronoUnit.MINUTES));
		System.out.println(d.get(ChronoUnit.SECONDS));

		System.out.println(d.getSeconds()); //
		System.out.println(d.getNano());//

	}
}
