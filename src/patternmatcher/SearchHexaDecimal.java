package patternmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchHexaDecimal {

	public static void main(String[] args) {
		String n1 = "0x123Z";
		String n2 = "ABC124";
		String n3 = "0X1234F";
		System.out.println("Searching...");
		String s = "vbhyuG0X1234F980ioe0X1H234F0xdknf0xj1bgtui580";
		searchValidHex(s);
		// 0X
		// 0x

		// tyreuiwoslxkcmtejas@vnjbtejasgmail.comhgfjdt@gmail.comksz,xmcnvbhfcnjxmcnvbncxm
		// valid gmail

	}

	static void searchValidHex(String s) {
		Pattern p = Pattern.compile("0[xX][0-9A-Fa-f]+"); // 0123456789
		Matcher m = p.matcher(s);
		// XX@XX.XXX
		while (m.find()) {
			System.out.println(m.start() + " :: " + m.group());
			// start() -> index
			// group() -> data
		}
	}
}
