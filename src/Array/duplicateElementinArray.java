package Array;

public class duplicateElementinArray {

	public static void main(String[] args) {

		int a[] = {2,5,3,4,2,5};
		
		for(int i=0; i<a.length; i++)
			for(int j=i+1; j<a.length; j++) {
				if(a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		
	}
}
