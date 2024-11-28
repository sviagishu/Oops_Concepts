// Call by value 
// if we call a method by passing a value is known as call by value. 
// the changes being done in the called method, it will not affect in calling method

package CallByValue;

public class passingByValue {
	
	
	// Example 1
	
//	static int change(int aCopy) {                 //12 has been passed here
//		 return aCopy = 30;  
//		 
//	//	 return aCopy;
////		
//	}
//
//	public static void main(String[] args) {
//		int a = 12;                                 // copy this in different memory location
//		change(a);
//		System.out.println(a);
//		
//	}

	// Example 2
//	int data = 50;
//	void change(int data) {
//		data = data + 10;
//	}
//	
//	public static void main(String[] args) {
//		passingByValue ps = new passingByValue();
//		System.out.println("Before change: " + ps.data);
//		ps.change(20);
//		System.out.println("Afer change: " +ps.data);
//	}
//	
	
	// ex 3

	int data = 50;
	int change(int data) { 
		 data = data + 10;
		 return data;
	}

	public static void main(String[] args) {
		passingByValue ob = new passingByValue();
		System.out.println("Before Change: " + ob.data);
		ob.change(20);                   // passing object as value       
		System.out.println("After change: " + ob.data);
	}

}
