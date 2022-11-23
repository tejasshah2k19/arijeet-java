import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		int a[][];
		a = new int[4][3]; // 4*3 => 12 [ size => 48 bytes ]

		int[][] c = new int[3][3];

		int[] d[] = new int[3][3];

		int b[][] = new int[3][3]; // 3*3 => 9 [size => 36 bytes ]
		Scanner scr = new Scanner(System.in);

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.println("Enter value : ");
				b[i][j] = scr.nextInt();
			}
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");// 1 2 3 4 5 6 7 8 9
			}
			System.out.println("");
		}
	}
}
