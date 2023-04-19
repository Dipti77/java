/*  Power of 2
*   a. Desc -> This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
*   b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
*   c. Logic -> repeat until i equals N.
*/

package bridgelabz;

public class PowerOf2 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		int i;
		int powerOfTwo = 1;
		for (i=1; i<=n; i++) {
			powerOfTwo = 2 * powerOfTwo;
			System.out.println(i + " " +powerOfTwo);
		}
	}
}

