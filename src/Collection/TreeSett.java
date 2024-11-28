// it uses tree for storage
// contains unique elements
// access and retrieve time of tree set is quick fast 
// ascending order

package Collection;

import java.util.*;

public class TreeSett {

	public static void main(String[] args) {
		TreeSet<String> h = new TreeSet<String>();
		h.add("ishu");
		h.add("abi");
		h.add("ganesh");
		h.add("jk");
		h.add("ishu");
		//Traversing 
		for(String st : h) {
			System.out.println(st);
		}
	}

}
