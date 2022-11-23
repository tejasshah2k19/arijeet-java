import static java.lang.Math.*;

public class StaticKeywordDemo {

	static int g;
	int k;

	void add() {
		k = 90;
		g = 900;
	}

	static void sub() {
		g = 909;
//		k=909;
	}

	public static void main(String[] args) {

		System.out.println(Math.random());

		System.out.println(Math.max(9, 890));

		System.out.println(random());

	}
}

//class Name 
//static -> variable[single copy]  , method 
