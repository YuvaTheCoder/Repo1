package Error_Handling;

public class Try_catch3 {
	public static void main (String args[]) {
		try {
		int[] arr4 = {0,1,2,3,4,5,6,7,8,9,10};
		System.out.println(arr4[89]);  // The first error only accounted, 
//below arithmetic error will not be considered. The program will be terminated from the loop.
// It will search for the Catch block like the exception has been mentioned or Not.
		arr4[12] = 11/0;
		}catch(ArithmeticException e) {System.out.println(e);}
		catch(ArrayIndexOutOfBoundsException f) {System.out.println(f);}
		System.out.println("Two Errors has been catched");
		}
	}
