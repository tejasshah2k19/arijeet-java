
public class AbstractDemo {

	public static void main(String[] args) {
//		Mouse m = new Mouse(); //  will not compile
	}
}

abstract class Mouse {
	int cursor = 2;

	void paint() {
		System.out.println("Mouse::paint()");
	}

	// abstract method - method having no body - only declaration
	abstract void click();

}

//abstract class can have abstract method 
// we can also have non abstract method in abstract class
//we can't create instance of abstract class 

abstract class OpticalMouse extends Mouse {
	abstract void doubleClick();
}

//concrete sub class 
class LaserMouse extends OpticalMouse {
	void click() {
		cursor = 5;
	}

	void doubleClick() {
		super.cursor = 10;
	}
}

//RBI -> wid dep chkBal transfer 

abstract class RBI {
	abstract void wid();

	abstract void asba();

	void intrst() {

	}
}

class ICICI extends RBI {
	void wid() {

	}

	void asba() {
	}
}
