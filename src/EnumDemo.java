
public class EnumDemo {
	public static void main(String[] args) {

		// application -> customer vendor admin
		// 1 admin 2 customer 3 vendor

		System.out.println(Role.CUSTOMER.role);
	}
}

enum Drink {
	SMALL(100), LARGE(200), EXLARGE(350);

	int value;

	Drink(int v) {
		value = v;
	}
}

enum Role {
	CUSTOMER(2), ADMIN(1), VENDOR(3);
	int role;

	Role(int role) {
		this.role = role;
	}
}