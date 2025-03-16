package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseGivenArray {


	public static void main(String[] args) {
		
//		getting input in compile time
	//	int a [] = {4,6,5,3,2};
		
		//getting input in run time
		int a[] = new int [5];
		System.out.print("Enter an array:");
		Scanner sc = new Scanner(System.in);
		
		   		
		for(int i=0; i<a.length; i++) {
			 a[i]  = sc.nextInt();
			 System.out.print(a[i] + " ");

		}
		
		//Reversing an array
		System.out.println("\n" + "Reverse an Array: ");
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i] + " " + "\t");
		}
		
		// using collection method but use wrapper class - Integer
//		Arrays.sort(a,Collections.reverseOrder());
//		System.out.println(Arrays.toString(a));
		
		
		 
	}
	

}
