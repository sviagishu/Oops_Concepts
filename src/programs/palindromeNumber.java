package programs;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		
		// for Number
//	    Scanner sc = new Scanner(System.in);     // take the input from the keyboard
//	    System.out.println("Enter the number: ");
//	     int num = sc.nextInt();   // read an integer entered by user
//	    int org = num;
//	    int rev = 0;
//	    
//	    while(num!=0) {
//	    	rev = rev*10 + num%10;
//	    	num = num/10;
//	    }
//	    //System.out.println(rev);
//	    if(rev == org) {
//	    	System.out.println("the given number " +org+ " is a palindrome");
//	    } else {
//	    	System.out.println("the give number " +org+ " is not a palindrome");
//	    }

		// for String
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();   // MADAM
		//String orgStr = str;
		String rev = "";
		
		int len = str.length();
		for(int i = len-1; i>=0; i--) {
			rev = rev + str.charAt(i);
			
		}
		//rev.trim();
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("the given String " +str+ " is a palindrome");
	    } else {
    	System.out.println("the give String " +str+ " is not a palindrome");
    }
	}

}


// % remainder , / quotient


/* num % 10

121 % 10 = 1

This gives the last digit.

Now:

rev = 0 * 10 + 1
     = 1

Next:

num = num / 10;

Integer division removes the last digit.

121 / 10 = 12

Now:

num = 12
rev = 1
Second Iteration

Current values:

num = 12
rev = 1
num % 10 = 2
rev = 1 * 10 + 2
     = 12
num = 12 / 10
     = 1

Now:

num = 1
rev = 12
Third Iteration

Current values:

num = 1
rev = 12
num % 10 = 1
rev = 12 * 10 + 1
     = 121
num = 1 / 10
     = 0

Now:

num = 0
rev = 121

Since num is now 0, the loop stops.

After the loop

Now we have:

org = 121
rev = 121 */


