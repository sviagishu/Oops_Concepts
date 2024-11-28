// Final keyword is used to restrict the class
// it can be initialized in the constructor only
// if the final variable that has no value, then it is called as blank final variable 
// it can be Variable , Method , class

//Method 1 - final variable
// compile time error - if the variable is final you cannot change the value

//package Final_Keyword;
//class eg {
//	final int limit = 90;
//	void run() {
//		limit = 100; // trying to change the value
//	}
//}
//
//
//public class final_variable {
//
//	public static void main(String[] args) {
//		eg ob = new eg();
//		ob.run();
//	}
//
//}


// Initial a variable only in constructor, but we cannot change the value.
package Final_Keyword;
class egg {
	final int limit;
//	void run(int limit) {
//		System.out.println("limit: " +limit);
//	}
	//constructor
	egg() {
		limit = 100;
	}
}
public class final_var {
	public static void main(String[] args) {
		egg obb = new egg();
		System.out.println(obb.limit);
		//run(limit);
		//obb.limit = 40;
	}
		
	}
	

	