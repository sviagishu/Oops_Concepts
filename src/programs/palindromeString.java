package programs;

public class palindromeString {
	String rev = "";
	
	
	void pali(String n) {
		int len = n.length();
		System.out.println(len);
		for(int i=len-1; i>=0; i--) {
			rev = rev + n.charAt(i);
		}
		System.out.print(rev);
		if(n.equals(rev)) {
			System.out.println("\t is a palindrome");
		} else {
			System.out.println("\t is not a palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    palindromeString p = new palindromeString();
		p.pali("MADAM");

	}

}


// i = 5-1 (4); 4>=0; ->  