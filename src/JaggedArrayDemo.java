import java.util.Scanner;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		// array 3 row
		// 1 row 4 elements
		// 2 row 5
		// 3 row 2
		int a[][] = new int[3][];

		a[0] = new int[4];
		a[1] = new int[5];
		a[2] = new int[3];

		// 00 01 02 03
		// 10 11 12 13 14
		// 20 21 22

		Scanner scr = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter value");
				a[i][j] = scr.nextInt();
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
