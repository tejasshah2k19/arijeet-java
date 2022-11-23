
public class DefaultValue {

	byte b;
	short s;
	char c;
	int i;
	long l;
	float f;
	double d;
	boolean bb;
	
	DefaultValue(){
	 System.out.println("DefaultValue()");	
	 b =9;
	 c = 'k';
	}
	DefaultValue(int u){
		 System.out.println("DefaultValue(int)");	
		i=u;
		}
	DefaultValue(float x,char y){
		 System.out.println("DefaultValue(float,char)");	
		 
		 f =x;
		 c = y;
		}
	void display() {
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bb);
	}

	public static void main(String[] args) {
//		DefaultValue d = new DefaultValue();
		DefaultValue d = new DefaultValue(20.20f,'k');

		d.display();
	}
}
