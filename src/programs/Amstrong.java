package programs;

// 1 + 125 + 9 
public class Amstrong {

	public static void main(String[] args) {
		int n=153;
		int i,j = 0;
		int a = n;
		
		
	  while(n>0) {
			i = n%10;
			j = j+(i*i*i);
			n = n/10;
		}
		if(a == j) {
			System.out.println("The given number is an Amstrong number");
		} else {
			System.out.println("The given number is Not an Amstrong number");
		}
		
	}
	
}
