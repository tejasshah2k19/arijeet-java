package patternmatcher;

public class IntegerLiterals {

	public static void main(String[] args) {
		// number system => decimal
		int a = 1;// decimal [ 0 - 9 ]
		int b = 10; // decimal
		int c = 0b10; // binary 0b or 0B -> binary [ 1 or 0 ]
		int d = 0123; // prefix 0 -> octal [ 0 1 2 3 4 5 6 7 ]
		int e = 0xABC123;// 0x 0X -> hexadecimal [ 0 1 2 3 4 5 6 7 8 9 A B C D E F ]
		System.out.println(b);// 10
		System.out.println(c); // 10 => 2

	}
}
