// logical & - checks the 2nd condition, only if the 1st condition is true
// bitwise && - check both the condition whether the 1st condition is true/false
package Operators;

public class Logical_Bitwise_AND {

	public static void main(String[] args) {
		int s = 3;
		int v = 6;
		int j = 2;
		System.out.println(s<v & s<j); // true & false = false
		System.out.println(s<v && s<j); // true && false = false

	}

}
