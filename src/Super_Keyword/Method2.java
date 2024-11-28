// Method 2 - it invoke the immediate parent class method

package Super_Keyword;

class personn {
	void show() {
		System.out.println("person class show method");
	}
}

class worker extends personn {
	void show() {
		System.out.println("emp class show method");
	}
	void display() {
		System.out.println("emp class display method");
	}
	
    void printing() {
    	super.show();
    	display();
    	show();
     }
}

public class Method2 {
   public static void main(String[] args) {
		worker obj = new worker();
		obj.printing();
	
	}

}
