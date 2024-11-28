package Constructor;

import java.util.Scanner;

public class defaultConstructor {
	 int id;
	 String name;

	 defaultConstructor() {
        //System.out.println("Enter the value 1: ");
        
       // System.out.println("Enter the value 2: ");
        
        System.out.println("Enter the value 1: ");
		Scanner sc = new Scanner(System.in);
		int val1 = sc.nextInt();
		
		 System.out.println("Enter the value 2: ");
		 Scanner sc2 = new Scanner(System.in);
	     int val2 = sc2.nextInt();
	     
	     int sum = val1 + val2;
		
		System.out.println("Total sum: " + sum);
	}
	
	// default with null value
	 void show() {
		 System.out.println("Name and ID: " + name + "\t" + id);
	 }
	public static void main(String[] args) {
		defaultConstructor dc = new defaultConstructor();
		dc.show();
	
}

}
