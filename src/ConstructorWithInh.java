
public class ConstructorWithInh {

	public static void main(String[] args) {
//		Parent p = new Parent();
		Child c = new Child();
//		Child c = new Child(12);
	}
}

class Parent {
	Parent() {
		System.out.println("Parent()");
	}
	Parent(int a){
		this();
		System.out.println("Parent(int)");
	}
}

class Child extends Parent {
	Child() {
//		super();
		super(1);
		System.out.println("Child()");
	}
	Child(int p){
		super(p);
		System.out.println("Child(int)");
	}
}