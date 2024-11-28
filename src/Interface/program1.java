// blue print of a class
// we can implement an infinite number of interface
// static constant & abstract method
// used to achieve loose coupling, support functionality of multiple inheritance and abstraction.
// if we use interface keyword, it provides full abstraction


// 1 interface & 1 class
package Interface;


interface program1 {
	
	void show();
}

class abc implements program1 {
	public void show() {
		System.out.println("print show");
		}
	
	public static void main(String args[]) {
		abc a = new abc();
		a.show();
		}
}
