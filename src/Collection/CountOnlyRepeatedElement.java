package Collection;

import java.util.HashMap;
import java.util.Map;

public class CountOnlyRepeatedElement {

	public static void main(String[] args) {
     int a[] = {30,20,30,40,30,10,30};
     
     HashMap<Integer, Integer> map = new HashMap<>();
     for(int i=0; i<a.length; i++) {
    	map.put(a[i], map.getOrDefault(a[i], 0) + 1);  // map.put(30, if element exist return its count, not return 0)
     }
     
     //printing
     for(Map.Entry<Integer,Integer> en : map.entrySet()) {
    	 if(en.getValue() > 1 ) {   // print only whose count is more than 1
    		 System.out.println(en.getKey() + "->" + en.getValue());
    	 }
     }

	}

}


/* map.put(a[i], map.getOrDefault(a[i],0) + 1);
this builds the map as
30->4
20->1
40->1..... */
