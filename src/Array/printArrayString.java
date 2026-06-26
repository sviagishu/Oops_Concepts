package Array;
import java.util.Arrays;
import java.util.Scanner;

class printArrayString
{
	public static void main(String args[])
	{
		
		 System.out.println("Enter the size of an array: ");
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 sc.nextLine();
		 
		 
		 String s[] = new String[num];
		  System.out.println("Enter the string values:");
		 for(int i=0; i<s.length; i++)
		 {
			 s[i] = sc.next();
		 }
		 
		 
		 System.out.println("Print it in array format");
//		 for(int i=0; i<s.length; i++) {
//			 System.out.println(s[i]);
//			
//		 }
		 System.out.println(Arrays.toString(s));
	}
}