package Array;

public class TransposeMatrix {
	
	public static void main(String arg[]) {
		//int a[][] = new int[3][3];
		int a[][] = new int[][] {{2,5,9},{1,8,4},{2,4,7}}; // or int a[][] = {{}}}{{}}{{}};
		System.out.println("Before Transpose");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(a[i][j] + "\t");
			
			}
			System.out.println();

		}
		
		System.out.println("After Transpose");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(a[j][i] + "\t");
			}
			System.out.println();
		}
	}
	
}


// ways to initialize a variable
//   1. int[] arr = {1, 2, 3, 4, 5};

//   2. int[] arr = new int[5]; // Size of array is 5
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;

//   3. int[] arr = new int[] {1, 2, 3, 4, 5};

// 2D

//   1. int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

//   2. int[][] arr = new int[3][3]; // 3x3 array
//       arr[0][0] = 1;
//       arr[0][1] = 2;
//       arr[0][2] = 3;


