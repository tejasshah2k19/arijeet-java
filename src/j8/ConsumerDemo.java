package j8;

import java.util.ArrayList;
import java.util.function.Consumer;

class ConsumerExample {
	// consume methods
	// print name in format
	static void printString(String str) {
		System.out.printf("%10s", str);
	}

	// print number in format
	static void printNumber(Integer num) {
		System.out.printf("%8d", num);
	}
}

public class ConsumerDemo {

	public static void main(String[] args) {

		
		Consumer<Integer> c = null;
		// accept()

		Consumer<String> c1 = ConsumerExample::printString;
		c1.accept("royal");

		Person p = new Person();
		p.firstName = "ram";
		p.lastName = "patel";
		System.out.println("\nData\n");
		p.forEach((obj) -> System.out.println(obj.firstName));

		p.forEach(obj2 -> System.out.println(obj2.firstName + " " + obj2.lastName));

		
		ArrayList<String> list  = new ArrayList<String>();
		list.add("ram");
		list.add("shyam");
		list.add("ravan");
		
		list.forEach(ConsumerExample::printString);

		
	}
}

class Person {
	String firstName;
	String lastName;

	public void forEach(Consumer<Person> c) {
		c.accept(this);
	}

}
