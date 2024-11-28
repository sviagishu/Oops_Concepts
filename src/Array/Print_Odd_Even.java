package Array;

public class Print_Odd_Even {

	public static void getValues(int a[]) {
		System.out.println("Odd Numbers are: ");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2 != 0) {
				System.out.print(a[i] + " ");
			} 
			
		}
		System.out.println();
		System.out.println("Even Numbers are: ");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		int a[] = {3,5,7,4,2,0,1};
		getValues(a);
		
	}

}
