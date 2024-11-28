// 2 derived classes from one super class

package HierarchyInheritance;

class Animal {
	public void sleep() {
		System.out.println("sleeping");
	
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("barking");
	}
}

class cat extends Animal {
	public void meaw() {
		System.out.println("meaw meaw");
	}
}

//if we create one more class under dog, then it will be multilevel

public class HierarMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat obj= new cat();
		obj.meaw();
		obj.sleep();
		Dog obj2 = new Dog();
		obj2.bark();
		obj2.sleep();
		

	}

}
