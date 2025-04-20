package ThreadSleep;

public class Sample1 {
public static void main (String[] args) {
	String s1 = "YUVASURIYAN";
	char[] ch = s1.toCharArray();
	for (int i = s1.length()-1 ; i>=0; i--) {
		char reversed = ch[i];
		System.out.print(reversed);
	}
			}
}
