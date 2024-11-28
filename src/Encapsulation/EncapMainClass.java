//declare a class variable in private
//provide get and set method to access and update the private class variable

package Encapsulation;

 class person {
	private String name;
	//get Method
	public String getName()
	{
		return name;
	}
	//set Method
	public void setName(String myName) {
		this.name = myName;
	}
	
}
public class EncapMainClass {
	public static void main(String args[]) {
		person p1 = new person();
	    p1.setName("ishu");
	  //  p1.getName();
	    System.out.println("getName:" + p1.getName());
		
	}
  }
