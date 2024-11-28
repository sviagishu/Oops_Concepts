// it can be accessible only within the class
// cannot be accessed outside of the class
// if you make any class constructor, you cannot create instance of that class 

package AccessModifier;

class A {
	private int i = 50;
	private void msg() {
		System.out.println(i);       // accessible only within the class
		System.out.println("Hello");
	}
	
	// constructor
	private A() {
 
	}
}

class privateAM {
    public static void main(String[] args) {
	   A obj = new A();
	   // cannot be accessed by another class
	   System.out.println(obj.i);
	   obj.msg();
	}

}
