package Array;

import java.util.Scanner;

public class searchElementInArray {

	public static void main(String[] args) {
	   
		int a[]  = { 50, 30, 20, 80, 40, 90};
		int sea = 1000;
		boolean flag = false;
		for(int x : a) {
			if(x==sea) {
				System.out.println("Element found");
				flag = true;
				break;
			} 
		}
		if(flag == false)
		System.out.println("Element not found");
		
	}
}


