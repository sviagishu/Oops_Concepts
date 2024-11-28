// Using Arrays - Collection concept

package Array;

import java.util.Arrays;

public class getSecondLargestValue {

	public static void main(String[] args) {
		
		int a[] = {5,6,2,9,4,7};
	    Arrays.parallelSort(a);	
	    int len = a.length;
	    System.out.println(len);
		int lar = a[len-2];
		int lar3 = a[len-3];
		//(or)
		//int lar = a[a.length-2];
		
		System.out.println("Second Largest: " + (lar));
		System.out.println("Second Largest: " + (lar3));
	}

}

