//java cannot allow duplicate with same function name in same class but we can achieve this by passing different parameter
//when you have same method name, with different parameters in same class is known as method overloading
package MethodOverloading;
class Student {
	static void marks(int a) {
		 System.out.println("Print the variable value of a: " + a);
		}
	public void marks(int a, int b) {
		int c = a + b;
		System.out.println("Print the sum of a and b: " + c);
	   }
}

public class overloadingMainClass {
	public static void main(String[] args) {
		Student.marks(10);
		Student stu = new Student();
		stu.marks(10, 10);
	}

}
