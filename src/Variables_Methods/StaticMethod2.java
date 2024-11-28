//cube

package Variables_Methods;

public class StaticMethod2 {
	
	static int cube(int n) {
		return n*n*n;
		
	}

	public static void main(String[] args) {
		int result = StaticMethod2.cube(5);
		System.out.println("Cube of given value: " + result );

	}

}


//error scenario // gives compile time error
// static method cannot use non-static member or call non-static method directly
// this or super keyword cannot be used in static context

//class A {
//	int a =50;
//	public static void main(String[] args) {
//		System.out.printn(a);
//	}
//}

