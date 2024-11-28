package Array;

public class Min_Max {

	public static void main(String[] args) {
		// finding min value in an array
		
		 System.out.println("Minimum value");
		 int a[] = {50,100,40,20,60};
		 int min = a[0];	        // considering first element in an array is minimum i.e. arr[0] is 22, so assuming 22 is minimum	
			for(int i=1; i<a.length; i++) {   // starting from i=1 since 0th index was considered as minimum i.e. 1<4
				if(a[i]<min)                // 50 < 22
				{
					min = a[i];
				}
							
			}
			System.out.println("Minimum value of an array: " +min);
		
		// Finding max value in an array
			
	    System.out.println("Maximum value");	
		int max = a[0];                        // considering 0th index as maximum, so 50 is the max value
		for (int i = 1; i<a.length; i++) {     // 1<4
			if(a[i]>max)  {                    // 100 > 50
				
				max = a[i];
			}
		}
		System.out.println("Maximum value of an array: " +max);
		
		



	}
	
	
	

}
