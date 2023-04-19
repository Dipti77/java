/*  Sum of three Integer adds to ZERO
*   a. Desc -> A program with cubic running time. Read in N integers and counts the number of triples that sum to exactly 0.
*   b. I/P -> N number of integer, and N integer input array
*   c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
*   d. O/P -> One Output is number of distinct triplets as well as the second output is to print the distinct triplets.
*/

package bridgelabz;

public class SumOfThree {

	public static void main(String[] args) {
		
		int[] array = {1, 2, -3, -1, 4, 6, 5};
		
		for (int i=0; i<=array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				for (int k=j+1; k<array.length; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.println("Numbers found: " +array[i] + "," +array[j] + "," +array[k]);
					}
				}
			}
		}
	}
}


