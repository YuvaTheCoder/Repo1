package Interview_Questions;

public class Palindrome {

	public static void main(String[] args) {
		String s1 = "MADAM";
		String rev = "";
		//char[] ch = s1.toCharArray();
		for (int i=s1.length()-1 ; i>=0 ; i--) {
			rev = rev + s1.charAt(i);
			
		}
		System.out.println(rev);

	if (s1.equals(rev)) {
		System.out.println("Its a Palindrome");
	}else {
		System.out.println("Its NOT a Palindrome");
		}
	}
}
