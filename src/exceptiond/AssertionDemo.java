package exceptiond;

public class AssertionDemo {

	public static void main(String[] args) {
		Calc c = new Calc();
		
		//assert disable 
		// -ea 
		assert c.mul(20, 30) == 600;// true -> exception runtime error
		System.out.println("done");//
		
	}
}

class Calc {
	int mul(int a, int b) {
		return a * b + 1;
	}
}