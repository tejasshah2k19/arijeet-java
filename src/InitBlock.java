
public class InitBlock {

	static {
		System.out.println("static --- 0 ");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method....");
//		Player p1 = new Player();
//		Player p2 = new Player();
//		Player.add();
		Class.forName("Player");
	}

}

class Player {
	String name;
	int score;

	public Player() {
		System.out.println("Player()");
	}

	{
		System.out.println("init block 1");
	}

	{
		System.out.println("init block 2 ");
	}

	// class load
	static {
		System.out.println("static 1");
	}

	static void add() {
		System.out.println("adD()");
	}
}
