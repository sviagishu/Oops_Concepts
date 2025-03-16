package Array;

import java.util.Arrays;

public class SortingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sorting ascending order using methods
				int b[] = {3,6,9,2,8,1};
//				System.out.println(Arrays.toString(b));
//				
//				Arrays.sort(b);
//				System.out.println(Arrays.toString(b));
//				
//				Arrays.parallelSort(b);
//				System.out.println(Arrays.toString(b));
//				for(int b1: b) {
//					System.out.println(b1);
//				}
				
				
		// Sorting array string
//				String s[] = {"i", "s", "h", "u", "j", "i"};
//			    System.out.println(Arrays.toString(s));
//			    Arrays.sort(s);
//			    System.out.println(Arrays.toString(s));
			    
			    
	    // using for loop
			    int temp;
			   
			    System.out.println("for loop");
			    for(int i=0; i<=5; i++) {
			    	for(int j=i+1; j<=5; j++) {
			    		if(b[i]>b[j]) {
			    			temp = b[i];
			    			b[i] = b[j];
			    			b[j] = temp;
			    		}
			    	}
			    	System.out.println(b[i]);
			    }
			    
//			    for(int i=0; i<=5; i++) {
//			    	System.out.println(b[i]);
//			    }
  }

}
