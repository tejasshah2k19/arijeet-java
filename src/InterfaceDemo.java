
public class InterfaceDemo {

	public static void main(String[] args) {

	}
}

//abstract -> class , interface , method 
//final -> class method variable 

abstract interface GOI {
	int k = 10;// variable final [constant variable]

	void jandhan();

	final int j = 20; // we can't modify value - constant
}

interface RBI2 extends GOI {
	// void jandhan();
	void wid();

	abstract void dep();
}

class SBI implements RBI2 {

	public void jandhan() {

	}

	public void wid() {

	}

	public void dep() {

	}

}
