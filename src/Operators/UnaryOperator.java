// incrementing/decrementing a value by one
package Operators;

public class UnaryOperator {

	public static void main(String[] args) {
		int i = 15;
		int a = 10;
		int c = -54;
		int d = 60;
		boolean t = true;
		boolean f = false;
		
		System.out.println("**** Type 1 ****");
		System.out.println(--i);  
		System.out.println(i++);  
		System.out.println(i--);  
		System.out.println(++i); 
		// I think so the position may/may not had been filled.
		System.out.println("**** Type 2 ****");
		System.out.println(a++ + ++a);
		
		System.out.println("**** Type 3 ****");
		System.out.println(~c); 
		System.out.println(~d);
		System.out.println(!t);
		System.out.println(!f);
		}

}


// 14 
// 14  15
// 15  14
// 15


//10 + 12 = 22 