
public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = "royaleducation is a educational institue this educational insti. located in ahmedabad";

		System.out.println(s1.contains("edu"));// true
		System.out.println(s1.indexOf("edu"));// 5
		System.out.println(s1.lastIndexOf("edu"));

		String s2 = "tejas@gmail.com";
		System.out.println(s2.startsWith("tejas"));// true
		System.out.println(s2.endsWith("@gmail.com"));// true

	}
}
