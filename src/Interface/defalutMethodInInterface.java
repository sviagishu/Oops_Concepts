// we can have a method body in interface but the method should be define as default

package Interface;

interface peagon {
	void peacock();
	default void msg () {
		System.out.println("printing the msg from interface");
	}
}

class birds implements peagon {
	public void peacock() {
		System.out.println("peacock method");
		}
}


public class defalutMethodInInterface  {
	
	public static void main(String[] args) {
//		birds bd = new birds();
//		bd.peacock();
//		bd.msg();
		
		peagon db = new birds();
		db.msg();
		db.peacock();
}

}
