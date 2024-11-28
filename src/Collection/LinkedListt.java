// it used doubly linked list internally to store the element, store duplicate elements as well.
// it maintains insertion order and it is non-synchronized
// manipulation is fast because there is no shifting is required


package Collection;

//import java.util.Iterator;
import java.util.*;

public class LinkedListt {

	public static void main(String[] args) {
		LinkedList<String> abc = new LinkedList<String>();   // creating linked list 
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
