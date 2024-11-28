package Array;

public class foundRepeatedElements {

	public static void main(String[] args) {
		
		int a[] = { 50, 40, 50, 30, 10, 50, 90, 50};
		int n = 50;
		int count = 0;
		for(int x : a) {
			if(x == n) {
				count ++;
			}
		}
		System.out.println("count of the value 50: " +count);
		
	}

}
