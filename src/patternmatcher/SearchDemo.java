package patternmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchDemo {

	public static void main(String[] args) {
		System.out.println("searching....");
		searchAllNumbers();
	}

	static void searchAB() {
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("aabaaaabaa");

		while (m.find()) {
			System.out.println(m.start());
		}
	}

	static void searchRange() {
//		Pattern p = Pattern.compile("[abcd]");
		Pattern p = Pattern.compile("[a-d]");

		Matcher m = p.matcher("aabaasldkfjghyutiroepaabaa");

		while (m.find()) {
			System.out.println(m.start() + " :: " + m.group());
			// start() -> index
			// group() -> data
		}
	}

	static void searchDigit() {
		Pattern p = Pattern.compile("[0-9]"); // 0123456789
		Matcher m = p.matcher("aa11baa22s33ld6kf8jg8h9y900ut0iroe5paa3b6aa");

		while (m.find()) {
			System.out.println(m.start() + " :: " + m.group());
			// start() -> index
			// group() -> data
		}
	}

	//[0-9]?
	//aa11baa22s33ld6kf8jg8h9y934ut0
	// + -> 1 or many  [ 1234 ] 
	// * -> 0 or many  [ 1234  1 2 3 4 ] 
	// ? -> 0 or 1 
	// . -> exact 1 
	
	//BAG BTG BHG 
	//"B.G";
	
	static void searchAllNumbers() {
		Pattern p = Pattern.compile("[0-9]+"); // 0123456789
		Matcher m = p.matcher("aa11baa22s33ld6kf8jg8h9y900ut0iroe5paa3b6aa");

		while (m.find()) {
			System.out.println(m.start() + " :: " + m.group());
			// start() -> index
			// group() -> data
		}
	}

//	String str = "BGN12356F5JKE53O34W5IEUR345TYFDH55S4JKZLAS54KEJRH45T4BGY6GNFM3D4KSL5ALSD5KVJH553BVJKDLS";
//	all the words from the above string ignore digits 

}
