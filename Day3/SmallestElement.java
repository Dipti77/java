// Java Program to print the smallest element in an array

package bridgelabz;

public class SmallestElement {

	public static void main(String[] args) {
		
		int[] number = {2, 18, 3, 9, 19, 5, 7, 16};
		
		int i;
		int smallest = number[0];
		
		for (i=0; i<number.length; i++) {
			if (number[i] < smallest) {
				smallest = number[i];
				}
		}
		
		System.out.println("Smallest element in given array is: " +smallest);
	}
}


