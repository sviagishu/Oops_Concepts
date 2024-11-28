// Method 3 - if the class is final , you cannot extend it.

// compile time error

package Final_Keyword;
final class bike {
}

class honda extends bike {
	void run() {
		System.out.println("running");
	}
}
public class final_Class {

	public static void main(String[] args) {
		honda ho = new honda();
		ho.run();

	}

}






