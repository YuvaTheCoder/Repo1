package GitHub_Upload;

public class Stringreverse {

	public static void main(String[] args) {
	String s1= "YUVA";
	String rev = "";
	
// The below line "i=s1.length()-1" represents the Start execution from the last String declared in s1.
// Here we are reversing using the Indices value, not length(). For that length(-1). 
//Indices is always less than one when compared to length().
// Ex: Indices for YUVA is (0,1,2,3) and length() is 4.
// If we print "s1.length()" it gives o/p as 4.
	
	for (int i=s1.length()-1 ; i>=0 ; i--) {
		rev = rev + s1.charAt(i);
		}
	System.out.println(rev);
	  }
	   }
