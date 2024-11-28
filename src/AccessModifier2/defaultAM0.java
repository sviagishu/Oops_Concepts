// accessible only within the package 

//----> this package has been trying to accessed by defaultAM package - gives compile time error

package AccessModifier2;

 class defaultAM0 {
	 void msg() {
		 System.out.println("accessed by another package");
	 }
}
