package exceptiond;

public class Assignment {

	public static void main(String[] args) {
		BankTest.checkDep();
		BankTest.checkWid();
		System.out.println("done...");
	}
}

// bank app 
// wid dep checkbalance 
// 

class Bank {
	int balance;

	void wid(int amt) {
		if (balance - amt >= 0) {
			balance = balance - amt;
		}
	}

	void dep(int amt) {
		balance = balance + amt+2000;
	}

	void checkBalance() {
		System.out.println(balance);
	}
}

class BankTest {
	static void checkWid() {
		Bank b = new Bank();
		b.balance = 10000;
		b.wid(5000);
		assert b.balance == 5000;
	}

	static void checkDep() {
		Bank b = new Bank();
		b.balance = 10000;
		b.dep(5000);
		assert b.balance == 15000:"Invalid deposit()- expecting 15000 but got"+b.balance;
	}

}