// 1 interface 2 class

package Interface;

interface shape {
	void print();
}

class circle implements shape{

	@Override
	public void print() {
		System.out.println("print circle");
		
	}
}

class oval implements shape {
	public void print() {
		System.out.println("print oval");
	}
}

public class program2 {

	public static void main(String[] args) {
		 shape s = new oval();
		 s.print();
		 
}

}
