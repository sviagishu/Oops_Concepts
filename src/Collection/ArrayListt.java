// it uses a dynamic array to store the duplicate elements of different data type
// it maintains insertion order & it's non-synchornized
// we can access the array elements randomly


package Collection;
import java.util.*;

public class ArrayListt {

	public static void main(String[] args) {
		
		ArrayList<String> abc = new ArrayList<String>();   //Creating an array
		abc.add("ishu");
		abc.add("abi");
		abc.add("ganesh");
		abc.add("jk");
		abc.add("ishu");
		
		//traversing list through an array
		Iterator itr = abc.iterator();
		while(itr.hasNext()) {                     // hasNext returns true if the iterator has more element
			System.out.println(itr.next());        // next returns the element and move pointer to the next element   
			
		}
	}

}
