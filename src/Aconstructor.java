
public class Aconstructor {

	public static void main(String[] args) {
		Zibra z = new Zibra();// tail=0 legs=0 name=null
		Zibra x = new Zibra(5);// tail=5 legs=0 name=null
		Zibra a = new Zibra();// tail=0 legs=0 name=null
		Zibra b = new Zibra(22);// tail=22 legs=0 name=null

		b.name = "ram";

		Zibra bb = new Zibra(b.name);// tail=0 legs=0 name=ram

		Mixer m1 = new Mixer();// m1 = null
		Mixer m2 = new Mixer(m1);//m1 = m1 

	}

}

class Zibra {

	public Zibra() {
	}

	public Zibra(int o) {
		tail = o;
	}

	public Zibra(String x) {
		name = x;
	}

	int tail;// 4 byte
	int legs;// 0
	String name;
}

class Mixer {

	Mixer m1;

	public Mixer() {
	}

	Mixer(Mixer m) {
		m1 = m;
	}
}
