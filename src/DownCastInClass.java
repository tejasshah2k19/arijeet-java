
public class DownCastInClass {

	public static void main(String[] args) {
		Car c = new Car();
		c.go();
		c.start();

		Dzire d = new Dzire();

		d.start();
		d.stop();
		d.go();

//		((Dzire)c).stop();//compile done 

		((Car) d).go();
		((Car) d).start();

		// Parent p = new Child();
		// Child c = new Parent(); //compile fail

		// Dzire dd = (Dzire) new Car();

		float f = 20.20f;
		int i = (int) f;// downcast -> 20

//		Dzire ddd = (Dzire)c; 

	}
}

class Car {
	void go() {
		System.out.println("Car::go()");
	}

	void start() {
		System.out.println("Car::start()");
	}
}

class Dzire extends Car {
	void go() {
		System.out.println("Dzire::go()");
	}

	void stop() {
		System.out.println("Dzire::stop()");
	}
}
