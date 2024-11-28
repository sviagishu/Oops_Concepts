// it represent the collection that uses hash table for storage
// hasing is used to store the elements in hashset and it contains unique item


package Collection;

//import java.util.ArrayDeque;
import java.util.*;

public class HashSett {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
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
