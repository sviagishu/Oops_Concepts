package Array;

public class findOddPosition {

	public static void main(String[] args) {
		
		int a[] = {4,6,1,5,3,9};
		System.out.println("Given Array:");
		for(int ele: a) {
			System.out.print(ele + " ");
		}
		
		System.out.println("\nOdd Position in an array: ");
		for(int i=0; i<a.length; i=i+2) {
			System.out.print(a[i] + " ");
		}

	}

}
