// Java Program to print the elements of an array present on an even position

package bridgelabz;

public class EvenPosition {

	public static void main(String[] args) {
		
		int[] numbers = {6, 9, 15, 4, 25, 2, 8, 10, 3, 20};
		
		System.out.println("Array elements on even position:");
		
		int i;
		for (i=1; i<numbers.length; i=i+2) {
			
			System.out.println(numbers[i]);
		}
		
	}
}
