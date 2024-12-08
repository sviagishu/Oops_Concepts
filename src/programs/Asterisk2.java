//* * * * * *
//* * * * * 
//* * * * 
//* * * 
//* * 
//*

package programs;

public class Asterisk2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) {
			for( int j=6; j>=i; j--) {
				System.out.print("* \t");
			}
			System.out.println(" ");
			}
		}
	

	}


// 1<=6 -> 6>=1 -> print *
//        -> 5>=1 -> print *