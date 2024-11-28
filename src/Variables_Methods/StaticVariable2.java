package Variables_Methods;

class employee {
	String name;   //instance variable
	int id;
	static int age = 24;  //static variable
	
	//constructor
//	employee(String n, int i) {
//		name =n;
//		id =i;
//	} changed to using this keyword
	
	employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	void show() {
		System.out.println("emp details: " + name + " & " + id + " & " + age);
		
	}
}

public class StaticVariable2 {

	public static void main(String[] args) {
		employee emp = new employee("ishu", 23890);
		employee emp2 = new employee("jk", 24789);
		emp.show();
		emp2.show();
		// we can change the value of age
		employee.age = 26;
		emp.show();
		emp2.show();

	}

}
