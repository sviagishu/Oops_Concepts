//Passing array to the method

package Array;

class single2 {
     
	static void min(int arr[]) {

		//print an array
		for (int element:arr) {
			System.out.println(element);
		}
		
		int min = arr[0];
		for (int i = 1; i<arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum value: " +min);
		
}
	
	public static void main(String[] args) {
		int a[] = {22,50,40,15};
		min(a);

	}

}
