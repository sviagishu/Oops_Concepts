// In call by value, the original value can be change if we passing an object as a value

package CallByValue;

public class passingByObRef {
	
	int a = 10;
	int change(passingByObRef ob) {    // passed object as value
		return ob.a = 50;
	}

	public static void main(String[] args) {
		passingByObRef ob = new passingByObRef();
		System.out.println("Before Change: " + ob.a);
		ob.change(ob);                   // passing object as value       
		System.out.println("After change: " + ob.a);
	}

}
