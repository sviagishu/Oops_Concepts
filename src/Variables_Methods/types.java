// local - declared inside the body of the method, cannot defined as static
// instance - declared inside the class, outside the body of the method
// static - variable declared with static, if create copy of static variable and we can share it all the instance of the classes.

package Variables_Methods;

class num {
	// instance variable
	 int a = 10;
	// Static variable
	 static int c = 30;
	  public void value() {
		 //local variable
	     int n = 20;
	     
	   }
 }
public class types {

	public static void main(String[] args) {
	  //instance variable
		int data = 90;
		num obj = new num();
	    obj.value();
	   }

}
