// Super keyword is used to refer the immediate parent class object

//Method 1 - used to refer immediate parent class variable

package Super_Keyword;
   
class person {
    String color = "white";
	}

class emp extends person {
	String color = "black";
	
	void display () {
		System.out.println(color);
		System.out.println(super.color);
	}

}

public class Method1 {
     public static void main(String[] args) {
		emp obj = new emp();
		obj.display();

	}

}
