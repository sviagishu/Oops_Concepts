package Abstraction;

//Abstract class 
//cannot create an object, if we want to access it must be inherit from another class 
//abstract method doesn't have body, we can give a body in sub class.
abstract class Animal {
 
	//Abstract Method doesn't have body
	public abstract void animalsound ();
	public void sleep() {
		System.out.println("sound be like: zzzz");
	}
}
//subclass	
 class dog extends Animal {
	public void animalsound()
	{
		//body of the animal sound can be provided here
		System.out.println("wewewe");
	}
}
public class AbstractMainClass {
	public static void main(String args[])
	{
		dog dg1= new dog();
		dg1.animalsound();
		dg1.sleep();
		
	}
}


