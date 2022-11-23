
public class StringBufferBuilderDemo {

	public static void main(String[] args) {

		String s = "royal";

		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.length());// 0
		System.out.println(sb.capacity());// 16

//		sb.reverse();
		sb.append("edu");
		System.out.println(sb);

		sb.insert(3, "ahmedabad");
		System.out.println(sb);

		sb.delete(3, 5);// 3 4
		System.out.println(sb);

		System.out.println(sb);
		
		String h =sb.toString();
	}
}
