package Array;
 
import java.util.Scanner;

public class MatrixSubtraction {

	public static void main(String[] args) {
		// creating two matrix
//		
//		int a[][] = {{5,2,7},{1,3,6}};
//		int b[][] = {{4,5,1},{8,2,3}};
		
		int a[][] = new int[2][3];
		int b[][] = new int[2][3];
		int i,j;
		
		//getting the input
		Scanner sc = new Scanner(System.in);
		
		// getting 1st array matrix
		System.out.println("Enter first matrix: ");
		for(i =0;i<2; i++) {
			for(j =0; j<3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		// getting 2nd array matrix
			System.out.println("Enter Second matrix: ");
			for(i=0; i<2; i++) {
				for(j =0; j<3; j++) {
					b[i][j] = sc.nextInt();
				}
		}
		
		// to store subtraction of 2 matrix
			
		System.out.println("Subtraction of 2 matrix");	
		
		int c[][] = new int[2][3];
		for(i=0; i<2; i++) {
			for(j=0; j<3; j++) {
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j] + " ");
				
			}
			System.out.println( );
		}
	}
}

