package String;

public class StringBuilder {

	public static void main(String[] args) {
		
		//Normal String
		String s1 = "ishu";
		String s2 = "sekar";
		String s5 = "ishwayasekar@gmail.com";
		String s3 = s1 + s2;
		System.out.println(s3);
	    System.out.println(s1.concat(s2));
//		s5.split(".");
//		System.out.println(ss);
	    
	    String ss1="java string split method by javatpoint";  
	    String[] words=ss1.split("str");//splits the string based on whitespace  
	    //using java foreach loop to print elements of string array  
	    for(String w:words){  
	    System.out.println(w);  
	    }  
		
	    // StringBuilder
	 //   StringBuilder s4 = new StringBuilder("isu");
	    
	}

}
