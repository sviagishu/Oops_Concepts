// it holds the element which are to be processed by their priorities
// it doesn't store null value in the queue

package Collection;

import java.util.ArrayList;
import java.util.*;

public class PriorityQueueee {

	public static void main(String[] args) {
		PriorityQueue<String> abc = new PriorityQueue<String>();   //Creating an array
		abc.add("ishu");
		abc.add("abi");
		abc.add("ganesh");
		abc.add("jk");
		abc.add("ishu");
		System.out.println("Head of the container/queue: " +abc.element());
		System.out.println("Head of the container/queue: " +abc.peek());
		
		//traversing list through an array
		Iterator itr = abc.iterator();
		while(itr.hasNext()) {                     // hasNext returns true if the iterator has more element
			System.out.println(itr.next()); 

	}
		abc.remove();
		abc.poll();
		System.out.println("after removing 2 element");
		System.out.println("Head of the container/queue: " +abc.element());
		Iterator itr2 = abc.iterator();
		while(itr2.hasNext()) {                     // hasNext returns true if the iterator has more element
			System.out.println(itr2.next()); 

	}
		
	}
}
