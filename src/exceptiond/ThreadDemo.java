package exceptiond;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {

	public static void main(String[] args) {//main thread 
		Print p = new Print();
		Copy c = new Copy();
	 
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.submit(p);
		

	}
}

//1) extends Thread 
//2) override run -> public void run()
//3) call run using start() 
class Print extends Thread {
	
	public void run() {
		printMsg();
	}

	void printMsg() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Print : " + i);
		}
	}
}

class Copy {
	void copyData() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Copy : " + i);
		}
	}
}