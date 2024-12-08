//*
//* *
//* * *
//* * 
//*

package programs;

import java.util.Scanner;

public class Asterisk4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();
		
		for(int i=0; i<=row-1; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		
		for(int i=row-1; i>=0; i--) {
			for(int j=0;j<=i-1;j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}

}

//row = 4
//i=0 - 0<=4-1(0<=3) , j=0 - 0<=0 -> *        *
//                   , j=1 - 1<=0 
//i=1 - 1<=4-1(1<=3) , j=0 - 0<=1 -> * 
//                   , j=1 - 1<=1 -> *        * *
//                   , j=2 - 2<=1 
//i=2 - 1<=4-2(2<=3) , j=0 - 0<=2 -> * 
//                   , j=1 - 1<=2 -> *        
//                   , j=2 - 2<=2 -> *        * * *   
//                   , j=3 - 3<=2 -> 
//i=3 - 1<=3-1(3<=2)  out of loop
//
//
//i=4-1(3) - 3>=0 , j=0 - 0<=3-1(2) -> *
//                , j=1 - 1<=2      -> *
//                , j=2 - 2<=2      -> *     
       
     

