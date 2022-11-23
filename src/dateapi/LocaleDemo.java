package dateapi;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		Locale locUS = new Locale("EN", "USA");
		Locale locJAPAN = new Locale("it");// jp
		Locale locHI = new Locale("hi", "in");// in np
		Locale locFr = new Locale("fr", "fr");

		DateFormat dfUS = DateFormat.getDateInstance(DateFormat.FULL, locUS);
		DateFormat dfJA = DateFormat.getDateInstance(DateFormat.FULL, locJAPAN);
		DateFormat dfHI = DateFormat.getDateInstance(DateFormat.FULL, locHI);
		DateFormat dfFR = DateFormat.getDateInstance(DateFormat.FULL, locFr);

		NumberFormat nfUS = NumberFormat.getCurrencyInstance(locUS);
		NumberFormat nfJA = NumberFormat.getCurrencyInstance(locJAPAN);
		NumberFormat nfHI = NumberFormat.getCurrencyInstance(locHI);
		NumberFormat nfFR = NumberFormat.getCurrencyInstance(locFr);

		Date d = new Date();

		System.out.println(dfUS.format(d));
		System.out.println(dfJA.format(d));
		System.out.println(dfHI.format(d));
		System.out.println(dfFR.format(d));

		float amount = 123456.6789f;
		System.out.println(nfUS.format(amount));
		System.out.println(nfJA.format(amount));
		System.out.println(nfHI.format(amount));
		System.out.println(nfFR.format(amount));

	}
}
