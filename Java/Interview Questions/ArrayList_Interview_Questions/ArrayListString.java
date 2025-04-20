package ArrayList_Interview_Questions;
import java.util.ArrayList;
//ArrayList is a class in Java

public class ArrayListString {
	public static void main (String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("Yuva");
		arr1.add("Surya");
		arr1.add("Dhee");
		arr1.add(0,"Delhi");  // Adding Delhi at the First place (index 0)
		// arr1.add(25);     // we cannot add integers to String ArrayList
		System.out.println(arr1);
	}
}