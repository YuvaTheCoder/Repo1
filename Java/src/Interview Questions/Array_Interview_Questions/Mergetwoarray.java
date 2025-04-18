package Array_Interview_Questions;

public class Mergetwoarray {
	public static void main (String args[]) {
 int[] num1 = {1,2,3};
 int[] num2 = {4,5,6};
 int[] merged = new int[num1.length + num2.length];

 //The "System.arraycopy" method is used to copy elements from one array to another.
 //System.arraycopy(sourceArray, sourcePosition, destinationArray, destinationPosition, length);
 // Copy elements from num1 to merged
  System.arraycopy(num1, 0, merged, 0, num1.length);
 
//Copy elements from num2 to merged
  System.arraycopy(num2,0,merged,num1.length,num2.length);
 
//Print the merged array
  System.out.println("Merged Array");
  for (int num : merged) {                 //This Line iterates individually all the element
	  System.out.println(num + "");
  }
}
}