package Array;

import java.util.Scanner;

public class CountRepeatedElements {

	public static void main(String[] args) {
		
		int a[] = { 50, 40, 50, 30, 10, 50, 90, 50};
		int n = 50;
		
//		int max = a[0];
//		for(int x:a) {
//			if(x>max) {
//				max=x;
//			}
//		}
//		
		
		int count = 0;
		for(int x : a) {
			if(x == n) {
				count ++;
			}
		}
		System.out.println("count of the max repeated number: " +count);
		
	}

}
