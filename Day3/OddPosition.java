// Java Program to print the elements of an array present on odd position

package bridgelabz;

public class OddPosition {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		System.out.println("Array elements on odd position:");
		
		int i;
		for (i=0; i<numbers.length; i=i+2) {
			
			System.out.println(numbers[i]);
		}
	}
}


