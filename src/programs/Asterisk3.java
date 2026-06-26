//1 2 3 4 
//5 6 7
//8 9
//10


package programs;

public class Asterisk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int k=1;
		for(int i=0; i<4; i++) {         // controls row i=0 -> row 1, i=1->row 2
			 for(int j=1; j<=4-i; j++) {   // controls how many numbers per row, 1<=4, print 1. 
				System.out.print(k + "\t");
				k++;                       // now k = 5
			}
			System.out.println(" ");
		}

	}

}


//1<=4 ->  4<=4-1(3) -> print *
//     ->  


//int k = 1;
//This is the number being printed
//It increases continuously
//It does NOT reset each row