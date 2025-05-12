package String;

public class reverString_placeNumBtw {
	public static void main(String args[]) {
		String input = "welcome";
		String rev = "";
		
		//creating an empty string
	     StringBuilder st = new StringBuilder();
	     
	     //reverse a given string
	     int len = input.length();
	     for(int i=len-1; i>=0; i--) {
	    	 rev = rev + input.charAt(i);
	     }
	    
	     System.out.println(rev);
	     
	     // append each character with its position
	     for(int i=0; i<rev.length(); i++) {
	    	 st.append(rev.charAt(i)).append(i+1);
	     }
	     
	     System.out.println(st.toString());
	}
}



//input = welcome
//output =e1m2o3c4l5e6w7