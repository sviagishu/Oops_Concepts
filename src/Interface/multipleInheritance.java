// 

package Interface;


interface print {
	void printt();
}

interface show {
	void printt();
}

   class displayy implements print,show {
    public void printt() {
		System.out.println("printable & Showable");
	}
}
  
public class multipleInheritance {

	public static void main(String[] args) {
		displayy c = new displayy();
		c.printt();

	}

}
