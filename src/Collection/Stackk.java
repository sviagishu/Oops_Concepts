// it is a sub class of Vector and it implements last in first out data structure
// it contains all the methods of vector and provide its method like push(), pop(), peek() etc...


package Collection;

import java.util.*;

public class Stackk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> abc = new Stack<String>();   // creating Vector
		abc.push("ishu");
		abc.push("sviag");
		abc.push("ijuu");
		abc.add(3, "sviag");
		abc.push("vijisek");
		abc.push("jk");
		abc.pop();                                  // it will remove the last element
		Iterator<String> itr = abc.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

	}

}
}
