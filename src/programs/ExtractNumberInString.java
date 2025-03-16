package programs;

public class ExtractNumberInString {
	public static void main(String[] arg) {
		String s = "ishu123jk456";
		
		//creating a string to store the extracted number
		StringBuilder num = new StringBuilder();
		
		//loop through the string to extract the digits
		for(int i = 0; i<s.length(); i++ ) {
			if(Character.isDigit(s.charAt(i))) {
				num.append(s.charAt(i));
			}
		}
		
		System.out.println(num.toString());
	}
}

