package exceptiond;

import java.util.Scanner;

public class ExceptionJ7 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		scr.close();

		// java + db ->

		try (Scanner scr1 = new Scanner(System.in);
//				String ss = new String("sds");
		) {

		} // finally{ scr1.close(); }
	}
}

//Closeable -> close() -> explicitly 
//AutoClosable -> close()* -> auto - try 
