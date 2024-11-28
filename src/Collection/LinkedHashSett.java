// contain unique element but maintain the insertion order

package Collection;

import java.util.*;

public class LinkedHashSett {

	public static void main(String[] args) {
		LinkedHashSet<String> h = new LinkedHashSet<String>();
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
