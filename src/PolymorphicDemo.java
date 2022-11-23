
public class PolymorphicDemo {

	public static void main(String[] args) {
		School s = new School();
		HnC h = new HnC();
		School sh = new HnC();
		// Parent p = new Child();
//		HnC hh = new School();
		sh.enroll();// compiletime -> parent
		sh.deregister();
//		sh.charge();

		System.out.println(s instanceof School);// true
		System.out.println(s instanceof HnC);// false
		System.out.println(sh instanceof School);// true
		System.out.println(sh instanceof HnC);// true
		System.out.println("sh instance of kidszee => " + (sh instanceof Kidzee));
		System.out.println(h instanceof School);

		Kidzee kz = new Kidzee();
		sh.process(sh);
		sh.process(kz);
	}
}

class Kidzee extends School {

}

class School {
	void enroll() {
		System.out.println("School::enroll()");
	}

	void deregister() {
		System.out.println("School:deregister()");
	}

	void process(School s) {
		if (s instanceof Kidzee) {

		} else {
			// deny
		}
		System.out.println(s);
	}
}

class HnC extends School {
	void enroll() {
		System.out.println("HnC::enroll()");
	}

	void charge() {
		System.out.println("HnC::charge()");
	}

	void process(School s) {

		System.out.println(s instanceof HnC);
	}
}