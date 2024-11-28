// it uses dynamic array to store the data element and it's similar to ArrayList
// but it is synchronized


package Collection;

import java.util.Iterator;
import java.util.*;

public class Vectorr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> abc = new Vector<String>();   // creating Vector
		abc.add("ishu");
		abc.add("sviag");
		abc.add("ijuu");
		abc.add(3, "sviag");
		Iterator<String> itr = abc.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

	}

}
}
