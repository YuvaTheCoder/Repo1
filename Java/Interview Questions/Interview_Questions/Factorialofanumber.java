package Interview_Questions;
import java.util.Scanner;

public class Factorialofanumber {
public static void main (String args[]) {
	int factorial = 1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Value which need to Factorial :");
	int num = sc.nextInt();
	sc.close();
	System.out.println("The Factorail you want to check is :" + num);
	
	for (int i=1; i<=num; i++) {
		factorial = i* factorial;
	}
	System.out.println("The Factorial for " + num + " is " + factorial);
}
}
