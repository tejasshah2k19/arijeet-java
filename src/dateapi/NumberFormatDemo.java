package dateapi;

import java.text.NumberFormat;

public class NumberFormatDemo {

	public static void main(String[] args) {
		float amount = 12345.6789f;
		System.out.println(amount);
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(amount));
		
		
		NumberFormat nfc = NumberFormat.getCurrencyInstance();
		nfc.setMaximumFractionDigits(2);
		System.out.println(nfc.format(amount));
		
		
		
	}
}
