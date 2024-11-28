package ExceptionHandling;

public class throw2 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		try {
			  j = 18/1;
				
			} catch(ArithmeticException e) {
				System.out.println("Cannot divide");
			} catch(Exception e) {
				System.out.println("something went wrong");
			}

		System.out.println(j);
	}

}
