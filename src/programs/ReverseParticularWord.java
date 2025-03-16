package programs;

public class ReverseParticularWord {
	public static void main(String[] arg) {
		String s = "Ishwarya Kuduvan Sekar";
		
		// change to all lower case 
		String s2 = s.toLowerCase();
		
		//Split a string into words
		String[] words = s2.split(" ");
		
		int len = words.length;
		System.out.println(len);
		
		//Find the word sekar and reverse it
		
		for(int i=0; i<words.length;i++) 
		{
			if(words[i].equals("sekar")) {
				//reverse the word
				words[i] = new StringBuilder(words[i]).reverse().toString();
			}
		}
		
		//join the words back into a single string
		String result = String.join(" ",words);
		
		// output
		System.out.println(result);
	}
}