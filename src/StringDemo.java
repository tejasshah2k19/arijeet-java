public class StringDemo {

	public static void main(String[] args) {
		String s1 = "royal"; // variable method
		System.out.println(s1);

		String s2 = "royal";
		System.out.println(s2);

		System.out.println(s1 == s2);// true -> memory reference
		System.out.println("s1.equals(s2) => " + s1.equals(s2));// true -> value

		String s3 = new String("royal");
		System.out.println(s3);
		System.out.println(s1 == s3);// false
		System.out.println("s1.equals(s3) => " + s1.equals(s3));// true

		String s4 = "Royal";

		System.out.println("s1.equals(s4) => " + s1.equals(s4));
		System.out.println("s1 == s4 => " + s1 == s4);
		System.out.println("s1.equalsIgnoreCase(s4) => " + s1.equalsIgnoreCase(s4));

		System.out.println("s1.length() => " + s1.length());

		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));
		System.out.println("***************");
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		
		System.out.println(s4.toLowerCase());//Royal  royal 
		System.out.println(s4.toUpperCase());//Royal ROYAL
        System.out.println(s4);//
        
        s4 = s4.toUpperCase();//ROYAL 
        System.out.println(s4);
        
        
        
        
	}
}