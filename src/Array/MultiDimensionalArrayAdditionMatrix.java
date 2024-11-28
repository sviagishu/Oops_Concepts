// data is stored in row and column based index

// addition of 2 matrix

// 2 5 4      1 4 2
// 7 1 9      3 0 6

// 2x3 matrix

package Array;

public class MultiDimensionalArrayAdditionMatrix {
	
	public static void main(String[] args) {
		
		// creating two matrix
		int a[][] = {{2,5,4},{7,1,9}};
		int b[][] = {{1,4,2},{3,0,6}};
		
		// storing sum of array 
		int c[][] = new int[2][3];
		
		for(int i = 0; i<2; i++ ) {
			for(int j = 0; j<3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				
				System.out.print(c[i][j] + " ");
				
			}
			
			System.out.println( ); // new line
			
			
		}
		
		
		
		

	}

}
