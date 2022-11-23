package exceptiond;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) throws IOException,Exception {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter two numbers");

		File f = new File("d.txt");

		f.createNewFile();

		try {
			int a = scr.nextInt();
			int b = scr.nextInt();
			if(b == 0 ) {
				throw new ArithmeticException("*******************");
			}
			int c = a / b;// throw new ArithmeticException();

			System.out.println(c);

		} catch (ArithmeticException e) {
			System.out.println("Please donot enter zero in second number");
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Only Whole Numers");
		} catch (Exception e) {
			System.out.println("SMW PTA");
			// sendMailToDeveloper(e.printStackTrace());
		} finally {
			System.out.println(" i am always executed...");
			//
		}
		//XX@XX.XX 
		//
		//
		
		// try--finally
		// try--catch--finally

		// try();

		System.out.println("finish....");
	}
}

//try catch 