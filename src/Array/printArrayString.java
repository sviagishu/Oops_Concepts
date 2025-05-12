package Array;

class printArrayString
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of an array: ");
		 String num = sc.nextLine();
		 
		 String[] s = new String[num];
		 
		 for(int i=0; i<s.length; i++)
		 {
			 s[i] = scan.nextLine();
		 }
		 
		 for(int i=0; i<s.length; i++) {
			 System.out.println(s[i]);
		 }
	}
}