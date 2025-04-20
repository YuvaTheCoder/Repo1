// Checking, if an Array is possible to split or not:

package Leetcode_Programs;

public class Subset_Example {
	public static void main (String[] args) {
		int array[] = {1,5,11,5};
		int total = 0;
		for (int num : array) {
			total = num +total;
		}
			System.out.println(total);
	if (total %2 ==0) {           // For comparison we need to use == operator
		System.out.println("The Total is Even we can split");
	}else {
		System.out.println("Its odd we can't split !");
	}
	}}

