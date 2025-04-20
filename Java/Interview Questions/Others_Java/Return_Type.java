//Below example describes the Return type
package Others_Java;

public class Return_Type {
	public static int add(int a, int b) {
		return a+b;
	}
	public static void main (String args[]) {
		//int a = 10;
		//int b=15;
		//int sum = add(a,b);
		
//We can use either above method or Below one for declaring the variables
		
		int sum = add(10,15);
		System.out.println("The Sum is :" + sum);
	}

}
