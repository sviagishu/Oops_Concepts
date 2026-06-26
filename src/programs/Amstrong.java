package programs;

// 1 + 125 + 27
//a number that is equal to the sum of its own digits, where each digit is raised to the power of the number of digits.

public class Amstrong {

	public static void main(String[] args) {
		int n=153;
		int i,j = 0;
		int a = n;
		
		
	  while(n>0) {
			i = n%10;
			j = j+(i*i*i);
			n = n/10;
		}
		if(a == j) {
			 System.out.println("The given number is an Amstrong number");
		} else {
			System.out.println("The given number is Not an Amstrong number");
		}
		
	}
	
}

//
//Now both variables contain:
//
//n = 153
//a = 153
//
//Then your while loop begins:
//
//while (n > 0) {
//    i = n % 10;
//    j = j + (i * i * i);
//    n = n / 10;
//}
//Iteration 1
//n = 153
//
//i = 153 % 10 = 3
//j = 0 + 27 = 27
//
//n = 153 / 10 = 15
//Iteration 2
//n = 15
//
//i = 15 % 10 = 5
//j = 27 + 125 = 152
//
//n = 15 / 10 = 1
//Iteration 3
//n = 1
//
//i = 1 % 10 = 1
//j = 152 + 1 = 153
//
//n = 1 / 10 = 0
//
//After the loop:
//
//n = 0
//j = 153
//a = 153
//
//Notice that n is now 0 because you've repeatedly divided it by 10.
//
//If you wrote:
//
//if (n == j)
//
//you would actually compare:
//
//0 == 153
//
//which is false, even though 153 is an Armstrong number.
//
//That's why you save the original value before changing n:
//
//int a = n;
//
//Then you compare:
//
//if (a == j)
//
//which is:
//
//153 == 153
//
//So the program correctly prints:
//
//The given number is an Armstrong number
//Think of it like this
//
//Suppose you have a piece of paper with:
//
//153