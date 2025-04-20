package Array_Interview_Questions;

public class Largestelementinaarray {
	public static void main (String args[]) {
		int[] arr = {1,85,25,6,36,47,89,77};
		int largest = arr[0];
		for(int num : arr) {
			if (num >largest) {
			largest =num;
		}
		
		}
	System.out.println("The largest Number in an Array is :" + largest);
}
}