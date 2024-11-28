//when a method have same name, same parameter in different class is known as method overriding
//When calling the function "name" in main method, the method in class2 overrides the method in class1

package MethodOverriding;

class student {
	
	public String name(String fname, String lname ) {
//		String fname = "ishu";
//		String lname = "jk";
		String name = fname + lname;
		System.out.println("Name from class 1: " + name);
		return name;
	}
}

//subclass method overrides the superclass method
class employee extends student {
	public String name(String fname, String lname) {
		fname +=lname;
		System.out.println("Name from class 2: " + fname);
		return fname;
	}
}

public class overridingMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee emp = new employee();
		emp.name("ishu","jk");
	}

}
