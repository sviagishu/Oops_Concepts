package stringgg;

public class reverString_placeNumBtw {
	public static void main(String args[]) {
		String input = "welcome";
		String rev = "";
		
		//creating an empty string
	     //stringBuilder st = new stringBuilder();
		java.lang.StringBuilder st = new java.lang.StringBuilder(); // forcing to use buildin class
	     
	     //reverse a given string
	     int len = input.length();
	     for(int i=len-1; i>=0; i--) {
	    	 rev = rev + input.charAt(i);
	     }
	    
	     System.out.println(rev);
	     
	     // append each character with its position
	     for(int i=0; i<rev.length(); i++) {
	      //st.append(rev.charAt(i)).append(i+1);
	    	 st.append(rev.charAt(i));
	    	 st.append(i + 1);
	     }
	     
	     System.out.println(st.toString());
	}
}



//input = welcome
//output =e1m2o3c4l5e6w7