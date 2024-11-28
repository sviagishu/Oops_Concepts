// Method 4 - reusing the value from parent class constructor

package Super_Keyword;

class personnn {
	int id;
	String name;
	personnn(int id, String name) {
		this.id = id;
		this.name = name;
	}
}


class empp extends personnn {
	float sal;
	
	empp(int id, String name, float sal) {
		super(id, name);
		this.sal = sal;
		}
	
	void show() {
		System.out.println("emp details: " + id + " " + name + " " + sal);
	}
}


public class Method4 {

	public static void main(String[] args) {
		
      empp obj = new empp(234, "jk", 56600);
      obj.show();
	}

}
