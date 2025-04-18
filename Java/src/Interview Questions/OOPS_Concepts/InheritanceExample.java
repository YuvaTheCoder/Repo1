package OOPS_Concepts;

public class InheritanceExample {
		public static void yuvan() {
		System.out.println("You called Yuvan");
}
	public static void surya() {
		System.out.println("You called Surya");
	}

	public static void main (String args[]) {

	yuvan();
	surya();
}
}

//We should not create the extends class as public, Only the main method should be public
class Dhee extends InheritanceExample {
	public static void main (String args[]) {	
//		InheritanceExample.main(args);
// if we use above comment it will give the output of Superclass also.
	yuvan();
	surya();
}
}