package programs;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		
		// for Number
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number: ");
	    int num = sc.nextInt();
	    int org = num;
	    int rev = 0;
	    
	    while(num!=0) {
	    	rev = rev*10 + num%10;
	    	num = num/10;
	    }
	    //System.out.println(rev);
	    if(rev == org) {
	    	System.out.println("the given number " +org+ " is a palindrome");
	    } else {
	    	System.out.println("the give number " +org+ " is not a palindrome");
	    }

		// for String
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the string: ");
//		String str = sc.next();   // MADAM
//		//String orgStr = str;
//		String rev = "";
//		
//		int len = str.length();
//		for(int i = len-1; i>=0; i--) {
//			rev = rev + str.charAt(i);
//			
//		}
//		//rev.trim();
//		System.out.println(rev);
//		if(str.equals(rev)) {
//			System.out.println("the given String " +str+ " is a palindrome");
//	    } else {
//    	System.out.println("the give String " +str+ " is not a palindrome");
//    }
	}

}
