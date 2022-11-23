
public class StringDemo3 {

	public static void main(String[] args) {
		String s = "jony jony yes papa";

		String strArr[] = s.split(" ");// jony , jony , yes , papa

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}

		// royal

		// layor

		// reverse() -> not available

		StringBuffer sb = new StringBuffer("royal");
		sb.reverse();//mutable 
		

		String rev = sb.toString();
		System.out.println(rev);

		String x = "abc";
		x.concat("def");// immutable -> not self destructive
		System.out.println(x);

		x = x.concat("def2");
		System.out.println(x);
	}
}
