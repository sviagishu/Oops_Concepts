//Deque - we can add and remove element both the side
//ArrayDequee - it is faster than ArrayList and Stack

package Collection;

import java.util.*;

public class ArrayDequee {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("ishu");
		dq.add("abi");
		dq.add("ganesh");
		dq.add("jk");
		dq.add("ishu");
		//Traversing 
		for(String st : dq) {
			System.out.println(st);
		}
		
//		Iterator<String> itr2 = dq.iterator();
//		while(itr2.hasNext()) {                     // hasNext returns true if the iterator has more element
//			System.out.println(itr2.next()); 
//
//	}
		

	}

}
