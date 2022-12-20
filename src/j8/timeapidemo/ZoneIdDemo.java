package j8.timeapidemo;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneIdDemo {

	public static void main(String[] args) {

		ZoneId ist  = ZoneId.of("Asia/Kolkata");
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		
		LocalTime istTime = LocalTime.now(ist);
		LocalTime tokyoTime = LocalTime.now(tokyo);
		
		System.out.println(istTime);
		System.out.println(tokyoTime);
		
		System.out.println(istTime.isBefore(tokyoTime));
		
		ZoneId defaultZone = ZoneId.systemDefault();
		System.out.println(defaultZone);
		System.out.println(defaultZone.getId());
		System.out.println(defaultZone.getDisplayName(TextStyle.FULL,Locale.ENGLISH));
		System.out.println(tokyo.getDisplayName(TextStyle.FULL,Locale.ENGLISH));

		
	}
}
