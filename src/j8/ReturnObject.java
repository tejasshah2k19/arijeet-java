package j8;

public class ReturnObject {

	static Object add(Integer a, Integer b) {
		return a + b;
	}

	static Integer add2(Integer a, Integer b) {
		return a + b;
	}

	public static void main(String[] args) {

		Integer a = (Integer) ReturnObject.add(10, 20);
		Integer b = ReturnObject.add2(20, 30);

	}
}
