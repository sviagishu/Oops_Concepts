//Finally block will always execute whether the exception is handled or not.
// case 1: when an exception does not occur


package ExceptionHandling;

public class finally1 {

	public static void main(String[] args) {
		try {
			System.out.println("Try block");
			//int[] marks= {70,50,60,30,65};
			int total = 70+20+90+68+85;
			int data = total/0;
			
		} catch(NullPointerException e) {
			System.out.println("Catch Block");
			System.out.println(e);
			
		} finally {
			System.out.println("Always execute");
			
		}
		System.out.println("rest of the code");
		

	}

}
