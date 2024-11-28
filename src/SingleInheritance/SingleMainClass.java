package SingleInheritance;

//one base class

class person {
	public void sleep() {
		System.out.println("sleeping");
	}
}

//one derived class
class abc extends person {
	public void work() {
		System.out.println("working");
	}
}

public class SingleMainClass {
 public static void main(String args[])
 {
	 abc a= new abc();
	 a.work();
	 a.sleep();
 }
}

