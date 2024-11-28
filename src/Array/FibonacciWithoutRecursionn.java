package Array;

public class FibonacciWithoutRecursionn {

	public static void main(String[] args) {
		
		//without using recursion
		
		 int n1=0;
		 int n2=1;
		 int n3;
		 int count=10;
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(int i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;                     // 0 + 1
		  System.out.print(" "+n3);     // 1
		  n1=n2;                        // n1 = 1
		  n2=n3;                        // n2 = 1
		 }    
		  
		 
		
	}

}


// 0 1 1