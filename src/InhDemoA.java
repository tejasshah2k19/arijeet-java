
public class InhDemoA {

	public static void main(String[] args) {
		Banta b = new Banta();
		b.printA();

	}
}

//1cr 
class Santa {
	int a = 90;
	void print() {
		System.out.println("Santa::print()");
	}
}

//50 lac 
class Banta extends Santa {
	int a = 50;

	void print() {
		System.out.println(a);
		System.out.println(this.a);
	}

	void printA() {
		System.out.println(super.a);
		super.print();
	}
}
