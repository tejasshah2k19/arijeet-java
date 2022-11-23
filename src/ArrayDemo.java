import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[]; // declaration
		a = new int[5]; // init

		// one dimension
		int b[] = new int[5]; // declaration and init

		// size ->5
		// 2 elements -> waste
		// 7 elements -> not possible

		// we can access b with an index
		// we can access elements of an array using an index -> subscript
		// index always starts with 0 and ends with size-1

		// 5 -> 0 1 2 3 4

		Scanner scr = new Scanner(System.in);

		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter number");
			b[i] = scr.nextInt();
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
