//Object is the parent class of all Java classes, so it can hold any data type (boxed).

//Java automatically converts primitives (like int) to their wrapper class (Integer) via auto-boxing.

package ArrayList_Interview_Questions;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMixed {
	public static void main (String[] args) {
		ArrayList<Object> mixedList = new ArrayList<>();
		mixedList.add("Yuva");   //String
		mixedList.add("Dhee");
		mixedList.add(25);     //integer
		mixedList.add(true);     //Boolean
		mixedList.add(0,100);
        mixedList.remove(25);
		System.out.println(mixedList);
	}

}
