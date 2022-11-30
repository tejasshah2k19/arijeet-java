package collectiond;

public class LambdaDemo {

	public static void main(String[] args) {
		Testing t = () -> {
			System.out.println("custom testing...");
		};
		t.test();
		t.testDefault();
		Testing.testStatic();

		Bank b = new Bank();
		b.balance = 1200000;
		b.doSomeStuff(() -> {
			System.out.println("this is from doSomeStuff");
			System.out.println(b.balance);
			if (b.balance < 0) {
				System.out.println("APP is in Invalid State : Neg Balance ");
			}
		});
		b.doSomeStuff(() -> {
			if (b.balance >= 100000) {
				System.out.println("App is in Invalid State : Exceed Balance");
			}
		});
	}
}

class BankI implements Testing {
	@Override
	public void test() {
		//
	}
}

class Bank {
	int balance;

	void doSomeStuff(Testing test) {
		test.test();
	}
}

//SAM interface - single abstract method
//functional interface 
@FunctionalInterface
interface Testing {
	public void test();

	default void testDefault() {
		System.out.println("i am default");
	}

	static void testStatic() {
		System.out.println("i am static");
	}
}

class A implements Testing {
	public void test() {
		System.out.println("testing started.....");
	}
}
