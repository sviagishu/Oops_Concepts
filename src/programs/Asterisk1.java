//*  
//* * 
//* * * 
//* * * * 
//* * * * * 

// 5 outer loops, it should run 5 times then increment 1
package programs;

public class Asterisk1 {

	public static void main(String[] args) {
	
		for(int i=1; i<=5; i++) {
			for( int j=1; j<=i; j++) {
				System.out.print("* \t");
			}
			System.out.println(" ");
			}
		}    
}

// 1<=5 -> 1<=1 yes print *
//      -> 2<=1 no  so moved to outer loop
// 2<=5 -> 1<=2 yes print *
//      -> 2<=2 yes print *
//      -> 3<=2 no  so moved to outer loop

  
