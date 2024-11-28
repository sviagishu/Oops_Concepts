// 2 interface & 1 class


package Interface;


interface printable {
	void print();
}

interface showable {
	void show();
}

   class abcd implements printable,showable {
    public void print() {
		System.out.println("printable");
	}
	public void show() {
		System.out.println("showable");
	}
   }

public class program3 {
	public static void main(String[] args) {
		abcd a = new abcd();
		a.print();
		a.show();

	}

   }

