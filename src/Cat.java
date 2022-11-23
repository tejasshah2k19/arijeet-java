
public class Cat {

	static int abc;
	String name;// instance variable 
	int hand;
	int leg;

	void walk() {
		System.out.println("Cat::Walk");
		// name
	}

	void run() {
		int k;//local
		System.out.println("Cat::Run");
		// name
	}

	public static void main(String[] args) {
		Cat c = new Cat();// name hand leg
		c.walk();
		c.run();
		c.abc=90;
		c.name="l";

		Cat x = new Cat(); // name hand leg
		x.name ="p";
		Cat y = new Cat(); // name hand leg
	}
}

class Dog {
}
