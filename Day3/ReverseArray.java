//java program to print the elements of an array in reverse order

package bridgelabz;

public class ReverseArray {

	public static void main(String[] args) {
		
		int i;
		int[] array = {10, 20, 30, 40, 50, 60};

		System.out.println("Original Array:");
		for (i=0; i<array.length; i++) {
			System.out.println(array[i] + " ");
		}

		
		System.out.println("Array in reverse order: ");
		for (i=array.length-1; i>=0; i--) {
			System.out.println(array[i] + " ");
		}
	}
}


