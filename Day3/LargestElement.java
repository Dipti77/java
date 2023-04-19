// Java Program to print the largest element in an array

package bridgelabz;

public class LargestElement {

	public static void main(String[] args) {
		
		int[] number = {12, 8, 10, 5, 9, 7, 20, 2};
		
		int i;
		int largest = number[0];
		
		for (i=0; i<number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
				}
		}
		
		System.out.println("Largest element in given array is: " +largest);
	}
}


