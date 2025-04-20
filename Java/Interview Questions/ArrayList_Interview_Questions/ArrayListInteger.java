//Java generics don't support primitive types like int, double, char, etc.
//So, we need to use Integer in the ArrayList

package ArrayList_Interview_Questions;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInteger {
public static void main (String[] args) {
	ArrayList<Integer> list1 = new ArrayList<>();
	list1.add(25);
	list1.add(46);
	list1.add(87);
	list1.add(25);
	list1.add(30);
	list1.add(1,85); //Adding index ---> it will add 85 at the Index place 1.
	list1.remove(0);   // Removing the value using Index value
	list1.remove(Integer.valueOf(87));  // It will remove the mentioned value, if Present in ArrayList.
	System.out.println(list1);
}
}
