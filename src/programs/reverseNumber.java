package programs;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int org = num;
		
		// Approach 1 - using algorithm
		int rev = 0;
		
		while(num!=0)     // 1232
		{
			rev = rev*10 + num%10;  // 0*10 + 1232%10 = 0+2 = 2
			num = num/10;     // 1232/10 = 123
		}

		System.out.println("reversed number: " +rev);
		
		
		// Approach 2 - using StringBuffer class
		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer revv = sb.reverse();
//		System.out.println("reveresed number: "+ revv);
		
		// Approach 3 - Using StringBuilder Class
//		StringBuilder sb = new StringBuilder(String.valueOf(num));
//		StringBuilder rev3 = sb.reverse();
//		System.out.println("revered order: " + rev3);
	}
}
	

