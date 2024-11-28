package Array;

public class singleDimentionalArray {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 40;
		a[1] = 20;
		a[2] = 10;
		a[3] = 50;
		a[4] = 60;
		
		System.out.println("****Traversing an array********");
		for(int i=0; i<a.length; i++)  //traversing an array
		{
			System.out.println(a[i]);
		}
    
		
		System.out.println("****Printing array values********");
		for(int element:a)
        System.out.println(element);
	}

}
