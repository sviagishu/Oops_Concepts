// interface extends interface


package Interface;

interface dog {
	void wow ();
}

interface puppy extends dog {
	void lolol();
}

class animals implements puppy {

	@Override
	public void wow() {
		System.out.println("wowwww");
	}

	@Override
	public void lolol() {
		System.out.println("lollollo");
		
	}
}
public class interface_Inheritance {

	public static void main(String[] args) {
		animals an = new animals();
		an.wow();
		an.lolol();
		

	}

}
