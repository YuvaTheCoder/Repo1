// Two Try_Catch Examples:
package Error_Handling;

public class Try_Catch4 {
public static void main (String args[]) {
	try {
	int a = 10;
	int b= a/0;
	System.out.println(b);
	}catch (ArithmeticException e) {
	System.out.println( e );
	System.out.println( " Exception in First Block");
	}
/*Above two print statement has been written in Single line also,Below mentioned the cmd
 System.out.println( e+ " Exception in First Block");
*/

	
// Another Set of Code:	
try {
	int[] arr1 = {0,1,2,3,4,5};
	System.out.println(arr1[10]);
}catch(IndexOutOfBoundsException e) {System.out.println(e);}
	int c= 5+5;
	System.out.println(c);
}
}
