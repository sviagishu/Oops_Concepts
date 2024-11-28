// pyramid
//*
//* *
//* * *
//* * * *
//* * * * *

package Loops;

public class NestedForLoop {

	public static void main(String[] args) {
		
		//Pyramid 1
		for (int i = 1; i<=5; i++) {
			for(int j=1; j<=i; j++) 
			{
				System.out.print("* ");
//				System.out.println("\t");
				
				//i++;
				
		     }
			System.out.println(" ");
		}
	
	 
		System.out.println("---------------------------");
		
		// Pyramid 2
//		* * * * * * 
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
		
		for (int i = 1; i<=6; i++) {
			for (int j = 6; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		
		
		System.out.println("---------------------------");
		
		// Pyramid 3 using for each loop
//		
		
		int arr[] = {45, 67, 23, 41, 89};
		for(int j : arr) {
			System.out.println(j);
		}
		
}
	

}





