// without static - see the output for the difference

package Variables_Methods;

public class diffStaticAndNomalVar {
	
	// without static
	//int count = 0;
	//with static - static variable will get the memory only once, if any object changes the value of the static variable, it will retain its value.
	static int count = 0;
	
	diffStaticAndNomalVar() {
		count ++;
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		diffStaticAndNomalVar dif = new diffStaticAndNomalVar();
		diffStaticAndNomalVar dif2  = new diffStaticAndNomalVar();
		diffStaticAndNomalVar dif3 = new diffStaticAndNomalVar();
		}

}





