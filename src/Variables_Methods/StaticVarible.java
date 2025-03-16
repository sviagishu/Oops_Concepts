// if we give variable as static then it will be common to all.
// Use class name to refer static variable.

package Variables_Methods;


public class StaticVarible {
	
	int age;
	static String name;
	String brand;
	
	public void show() {
		System.out.println(name + " " + age + " " + brand);
	}

	public static void main(String[] args) {
		StaticVarible sta = new StaticVarible();
		sta.age = 23;
		sta.name = "ishu";
		sta.brand = "samsung";
	//	StaticVarible.brand = "samsung";
		
		StaticVarible sta1 = new StaticVarible();
		sta1.age = 24;
		sta1.name = "ishu";
		sta1.brand = "realme";
		
		//declare the name as static and change the sta name, it will affect the sta1 as well.
		sta.name = "abi";
		
		sta.show();
		sta1.show();
		
		// want to change name 
		StaticVarible.name = "jk";
		sta.show();
		sta1.show();
		
	}

}
