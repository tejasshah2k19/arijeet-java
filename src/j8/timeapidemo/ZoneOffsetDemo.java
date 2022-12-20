package j8.timeapidemo;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneOffsetDemo {

	public static void main(String[] args) {
		ZoneOffset z = ZoneOffset.UTC;
		ZonedDateTime zdt =  ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(zdt);
		System.out.println(z.adjustInto(zdt));
	}
}
