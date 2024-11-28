package Constructor;

public class constructorOverloading {
	
	int id;
	String name;
	int age;
	
	constructorOverloading(int i, int a, String n) {
		id = i;
		age = a;
		name = n;
	}
	
	constructorOverloading(String n, int i) {
		name = n;
		id = i;
	}
	
	void display() {
		System.out.println("Employee ID: " + id + " , Name: " + name + " & age: " + age);
	}
	
	

	public static void main(String[] args) {
		
		constructorOverloading co = new constructorOverloading(07, 24, "jk" );
        constructorOverloading co2 = new constructorOverloading("ishu", 11);
        co.display();
        co2.display();
    }

}
