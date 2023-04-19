// Find 2nd Largest Number in an Array

package bridgelabz;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] array = {4, 10, 6, 12, 8, 5};
		
		int i;
		int max = 0;
		int second_max= 0;
		
		for (i=0; i<array.length; i++) {
			if (array[i] > max) {
				second_max = max;
				max = array[i];
			}
			
			if (max > array[i] && array[i] > second_max) {
				second_max=array[i];
			}
		}
		
		System.out.println("Second largest number in given array is: " +second_max);
	}
}
