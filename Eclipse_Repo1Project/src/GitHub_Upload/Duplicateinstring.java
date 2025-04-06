package GitHub_Upload;

public class Duplicateinstring {
	public static void main (String[] args ) {
		String s1= "YUVASURIYAN";
		char[] ch = s1.toCharArray();

/*The statement char[] ch = s1.toCharArray(); is a Java code snippet that converts the 
String object s1 into a character array (char[]). */

		for (int i=0; i<s1.length() ; i++) {  //This will like a initiater
//This line states it will compare the First Element with all other Element 
			for (int j=i+1; j<s1.length(); j++) {   
				if (ch[i] == ch[j]) {
				System.out.println(ch[j]);
			}
		}
		}
	}

}

