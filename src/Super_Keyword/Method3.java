// Method 3 - used to invoke the immediate parent class constructor

package Super_Keyword;

class lady {
	lady () {
		System.out.println("constructor from parent class");
	}
}

class women extends lady {
	women() {
		super();
		System.out.println("constructor from child class");
		
	}
}

public class Method3 {

	public static void main(String[] args) {
		women wo = new women();
		

	}

}
