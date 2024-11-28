// if the method is static, we can call it directly with the help of class name without creating an object
// static variable can be declared inside static method but we cannot use normal variable inside static method -> TO overcome 
// object reference - we can use non-static variable inside static method if we have object reference

package Variables_Methods;


public class StaticMethod {
	static String name = "ishu";
	int age = 50;
	// non-static method
	public void show() {
		System.out.println(name+ " " +age);
	}
	
	// static method
	public static void show1(StaticMethod sta) {
		// not possible to print age since it is non static
		//System.out.println(name+ " " +age);
	// -> To overcome this we can use object reference
		System.out.println(name+ " " + sta.age);
	 
		
	}

	public static void main(String[] args) {
		StaticMethod sta = new StaticMethod();
		sta.show();
		// for non-static variable to access inside static class
		StaticMethod.show1(sta);
		
	}

}
