//ArrayIndexOutofBound -- Below Example
package Error_Handling;

public class Try_Catch2 {
public static void main (String[] args) {
	try {
	int arr1[] = {0,1,2,3,4,5,6,7,8,9,10};
	System.out.println(arr1[7]); // Total array characters we have 10, but here trying to call 12th place.
	}catch(ArrayIndexOutOfBoundsException e) {System.out.println(e);}
	System.out.println("Below code Executed");
}
}
