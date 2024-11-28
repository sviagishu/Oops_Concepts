package Constructor;

public class copyConstructor {
	
	int id;
	String name;
	
	copyConstructor(int i, String n){
		id = i;
		name = n;
		
	}
	
	copyConstructor(copyConstructor a) {
		id = a.id;
		name = a.name;
		
	}
	 
	void show() {
		System.out.println("Employee name and id: " + name + " & " + id);
	}

	public static void main(String[] args) {
		copyConstructor cc = new copyConstructor(7, "jk");
		copyConstructor cc2 = new copyConstructor(cc);
		cc.show();
		cc2.show();
		
	}

}
