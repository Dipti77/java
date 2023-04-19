/* Harmonic Number
*  a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
*  b. I/P -> The Harmonic Value N. Ensure N != 0
*  c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
*  d. O/P -> Print the Nth Harmonic Value.
*/

package bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		
		int i;
		double sum = 0.0;
		for (i=1; i<=n; i++) {
			sum = sum + (1.0 / i);
		}
		System.out.println(sum);
		}
}


