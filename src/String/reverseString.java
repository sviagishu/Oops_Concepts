package String;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		
		String org = str;
		
	//	Approach 1 - using concatenation operator
		String rev = "";
		int len = str.length();
		for(int i = len-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("revered string: " +rev);
		
		
		//Approach 2 - using character array(convert string into char array
//		String rev = "";
//		char a[] = str.toCharArray();
//		int len = a.length;
//		for(int i = len-1; i >=0; i--) {
//			rev = rev + a[i];
//		}
//		System.out.println("revered string: " +rev);
		
		
		//Approach 3 - using String Buffer class
//		StringBuffer sb = new StringBuffer("ishwarya");
//        sb.reverse();  // Reverse the StringBuffer

        // Print the reversed string directly from StringBuffer
//        System.out.println("Reversed string: " + sb.toString());
	}

}
