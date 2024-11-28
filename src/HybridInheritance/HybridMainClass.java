// combination of all

package HybridInheritance;

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

class puppy extends Dog {
	public void weep() {
		System.out.println("weeping");
	}
}

public class HybridMainClass {

	public static void main(String[] args) {
		cat obj= new cat();
	    obj.meaw();
		obj.sleep();
		puppy pup = new puppy();
		pup.weep();
		pup.bark();
		

	}

}
