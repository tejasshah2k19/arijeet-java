
public class OverLoadingDemo {

	public static void main(String[] args) {

	}
}

class CalcA {
	// method overloading -> name same , arg different

	void add() {
		// scan
		// add
		System.out.println("add()");
	}

	void add(int a, int b) {
		// add
		System.out.println("add(int,int)");
	}

	void add(int a, int b, int c) {
		// add
		System.out.println("add(int,int,int)");
	}

	void add(float a, float b) {
		// add
		System.out.println("add(float,float)");
	}
}
