// java program to print the duplicate elements of an array

package bridgelabz;

public class DuplicateArray {

	public static void main(String[] args) {
			
		int[] array = {3, 5, 1, 7, 2, 4, 5, 1, 3, 6};
			
		int i, j;
		System.out.println("Duplicate elements in given array is: ");
			
		for (i=0; i<array.length; i++) {
			for (j=i+1; j<array.length; j++) {					
				if (array[i] == array[j]) {
					System.out.println(array[i]);
				}
			}
		}
	}
}


