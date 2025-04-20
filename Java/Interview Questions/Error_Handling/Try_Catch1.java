// Arithmetic Exception---- Example code
package Error_Handling;

public class Try_Catch1 {
public static void main (String args[]) {
	try {
	int a= 10;
	int b = a/0;   
	System.out.println(b);
	}catch (ArithmeticException e) {System.out.println(e);}
	System.out.println("Below line Executed");
}
}
