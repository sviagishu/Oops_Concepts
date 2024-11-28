//Case 2: When an exception occur but not handled by catch block

package ExceptionHandling;

public class finally2 {

	public static void main(String[] args) {
		try {
			System.out.println("Try block");
			//int[] marks= {70,50,60,30,65};
			int total = 73+28+92+68+83;
			int data = total/0;
			
		} catch(ArithmeticException e) {
			System.out.println("Catch Block");
			System.out.println(e);
			
		} finally {
			System.out.println("Always execute");
			
		}
		System.out.println("rest of the code");
		


	}

}
