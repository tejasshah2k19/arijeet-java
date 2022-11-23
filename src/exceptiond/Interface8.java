package exceptiond;

public class Interface8 {
	public static void main(String[] args) {

	}
}

interface Doubt {
	static int sum() {
		return 100;
	}

	default void gg() {

	}
}

class A {
	static void sub() {

	}
}

class DoubtImpl extends A implements Doubt {

	static void add() {

	}

	public void gg() {

	}

	void go() {
		Doubt.super.gg();

		add();
		sub();
		// System.out.println(sum());
		System.out.println(Doubt.sum());
		DoubtImpl dd = new DoubtImpl();
//		System.out.println(dd.sum());

	}
}