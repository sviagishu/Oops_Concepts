
package MultiLevelInheritance;

//base class
class person {
	String name;
	public void personDetails(String name) {
		this.name = name;
		System.out.println("Person Name:" + name);
	}
}

class student extends person {
	
	int age;
	public void stuDetails(int age) {
	    this.age = age;
	    System.out.println("Student age:" + age);
	}
}

class employee extends student {
	double lpa;
	public void empDetails(double lpa) {
		this.lpa = lpa;
		System.out.println("Emp lpa:" + lpa);
	}
}

public class multiMainClass {
	public static void main(String args[]) {
		employee emp = new employee();
		emp.empDetails(8.2);
		emp.stuDetails(25);
		emp.personDetails("ishu");
		
	}
}


//
//
//class A {
//	public void a() {
//		int one = 1;
//		System.out.println(one);
//		
//	}
//}
//
//class B extends A {
//	public void b() {
//		int two = 2;
//		System.out.println(two);
//	}
//}
//
//class C extends B{
//	public void c() {
//		int three = 3;
//		System.out.println(three);
//	}
//}
//
//public class multiMainClass {
//	public static void main(String arg[]) {
//		C obj = new C();
//		obj.c();
//		obj.b();
//		obj.a();
//		
//	}
//}