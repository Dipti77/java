/* 2D Array
*  a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
*  b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
*  c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
*  d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with OutputStreamWriter to print the output to the screen.
*/

package bridgelabz;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
		System.out.println("Enter 2D array size: ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		System.out.println("Enter array elements: ");
		
		int[][] twoD = new int[rows][columns];
		
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				twoD[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nOutput: \n");
		for (int []x: twoD) {
			for (int y: x) {
				System.out.println(y + "      ");
			}
			System.out.println();
		}
	}
}
