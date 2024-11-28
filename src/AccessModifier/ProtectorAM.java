// Accessible only within the package
// accessible outside the package through child class


package AccessModifier;

import AccessModifier2.*;

public class ProtectorAM extends ProtectorAM0 {

	public static void main(String[] args) {
	 
	   	
//	   ProtectorAM0 pt = new ProtectorAM0();
//	   // compile time error without extend the package
//	   pt.msg();
		
		// after extends the package
		ProtectorAM pt = new ProtectorAM();
		pt.msg();

	}

}
