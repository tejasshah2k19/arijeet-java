package j8.timeapidemo;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);

		LocalTime time1 = LocalTime.of(19, 00);
		System.out.println(time1);

		LocalTime time2 = time1.plusMinutes(90);
		System.out.println(time2);
		// minusMinutes

 
		
		// hours
		// seconds
		// minutes

		ZoneId z1 = ZoneId.of("Asia/Kolkata");
		ZoneId z2 = ZoneId.of("Asia/Tokyo");
		ZoneId z3 = ZoneId.of("America/Los_Angeles");
		
		LocalTime tz1 = LocalTime.now(z1); // 19 dec 12.35 pm 
		System.out.println(tz1);
		
		LocalTime tz2 = LocalTime.now(z2);
		System.out.println(tz2);
		
		LocalTime tz3 = LocalTime.now(z3); // 18dec 11.5 pm 
		System.out.println(tz3);
		
		
		System.out.println("Diff between india and LosAngelese " + ChronoUnit.MINUTES.between(tz1, tz3));
		
		System.out.println("Diff between india and LosAngelese " + ChronoUnit.HOURS.between(tz1, tz3));
		
		//630 => 10.30 
		
	}
}
