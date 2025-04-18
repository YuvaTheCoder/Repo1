package Others_Java;

public class Numberofdigitsinanumber {
	public static void main (String args[]) {
		int num = 12345;
		int count = String.valueOf(num).length();
		System.out.println(count);
	}}

// The String.valueOf(num) converts the integer(num) into String. 
// .length() then calculates the number of characters in the string, which corresponds
//to the number of digits in the number.