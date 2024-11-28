package ExceptionHandling;

public class tryCatch {

	public static void main(String[] args) {
		
	// Method 1	
//	 int data  = 50/0;
//	 System.out.println(data);
	 
	 //Method 2 surrounded by try catch
//	 try {
//		 int b = 40/0;
//	 } catch(ArithmeticException e) {
//		 System.out.println(e);
//	 }
     
	//Method 3
//		 try {
//			 int b = 40/0;
//			 System.out.println("Exception occurs");
//		 } catch(Exception e) {
//			 System.out.println(e);
//		 }
//		 System.out.println("Rest of the code");
		
		
		// Array index out of bound Exception
		try {
		  int a[] = new int[5];
		  a[5] = 10;
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		

	 
	}

}
