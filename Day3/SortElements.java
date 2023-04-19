// Java Program to sort the elements of an array in ascending order

package bridgelabz;

import java.util.Arrays;

public class SortElements {

	public static void main(String[] args) {
		
		int array[] = {5, 2, 4, 6, 9, 10, 3};
		
		int i, j, temp;
		for (i=0; i<array.length; i++) {
			for (j=i+1; j<array.length; j++) {
				if (array[i] > array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.println("Elements of an array sorted in ascending order: ");
		
		for (i=0; i<array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
}



