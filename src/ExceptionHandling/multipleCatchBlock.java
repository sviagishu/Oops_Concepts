// at a time only one exception occurs and at a time only one catch block is executed.

package ExceptionHandling;

public class multipleCatchBlock {

	public static void main(String[] args) {
		try {
			int a[] = new int[6];
			a[8] = 70/2;
		} catch(ArithmeticException e) {
			System.out.println(e);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
