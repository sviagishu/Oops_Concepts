// Count Occurrence of all the elements

/* HashMap in java is a class used to store data in Key-value pairs.
Key is unique
quickly add, update and get values
very fast operations

without HashMap: we must compare each element with all others. */

package Collection;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfAllElements {

	public static void main(String[] args) {
		int a[] = {50,30,50,20,30,30,20,50,10};
		
		HashMap<Integer, Integer> map = new HashMap<>();  // create map  for number -> count
		for(int i=0; i<a.length; i++) {          // visit each element
			if(map.containsKey(a[i])) {          // check if the number already exist in map? if yes
				map.put(a[i],  map.get(a[i]) + 1);   // if yes, get the current count of a[i] and increase the count, map.put(50,2);
			} else {
				map.put(a[i], 1);   // if not, add element with count 1
			}
			
		}
		
		// print result
		System.out.println("Element Occurrences: ");
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {     // entrySet() used to convert map into set of entries
			System.out.println(entry.getKey() + " -> " + entry.getValue());  // getKey -> number, getValue -> count
		}
		

	}

}


/* Output
50 -> 3
30 -> 3
20 -> 2
10 -> 1  */

//  map.get(a[i] + 1) // get the current count and add 1
//  map.put(a[i])    // update it in map
//  so map.put(a[i], map.get(a[i] + 1));


/* printing part explanation:
	After count, your map looks like
	{50=4, 40=1, 20=2, 10=1}
so we need to read and print each key-value pair
map.entrySet() - this converts map into a set of entries
so it would be {50,4}, {40,1}, {20,2}
Now loop through each entries
*/