package Array;

import java.util.Scanner;

  class printArrayNumber 
  {
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of an array: ");
		 int num = sc.nextInt();
		 sc.nextLine();
		 
		 int[] s = new int[num];  // array declaration
		 System.out.println("Enter the array values: ");
		 for(int i=0; i<s.length; i++)
		 {
			 s[i] = sc.nextInt();
		 }
		 
		 System.out.println("Print the array values: ");
		 for(int i=0; i<s.length; i++) {
			 System.out.println(s[i]);
		 }
		 //Reverse an array
	for(int i=s.length-1; i>=0; i--) {
	    System.out.println("Reverse an given array: ")
		System.out.println(s[i]);
	}
	  }
	
   }
