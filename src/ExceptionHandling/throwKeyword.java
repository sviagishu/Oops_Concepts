
// throw keyword is used to throw an exception, we can throw either checked/unchecked exception
// we specify the object which needs to be thrown and we can provide the some message

package ExceptionHandling;

public class throwKeyword {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("person is not eligible for vote");
		} else {
			System.out.println("Eligible for vote");
		}
	}

	public static void main(String[] args) {
		validate(10);
		System.out.println("rest of the code");
	}

}
