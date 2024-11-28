package Array;

import java.util.Arrays;

public class findEvenPosition {

	public static void main(String[] args) {
		
		int a[]  = {3,5,4,6,7,2,8,9};
		//To print array in string
		System.out.println("Given Array: " + Arrays.toString(a));
		
		for(int i = 1; i<a.length; i=i+2) {
			System.out.println(a[i]);
		}
	}

}
