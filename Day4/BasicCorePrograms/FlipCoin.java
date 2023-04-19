/*   1. Flip Coin and print percentage of Heads and Tails
*    a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
*    b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
*    c. O/P -> Percentage of Head vs Tails
*/

package bridgelabz;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		
		int heads = 0;
		int tails = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		int count = 1;
		double random=0.0;
		
		while (count <= number) {
			random = Math.random();
			System.out.println(count+ " " + random);
		
			if (random < 0.5) {
				heads++;
				System.out.println(" heads ");
			}else {
				tails++;
				System.out.println(" tails ");
			}
			count++;
		}
		
		System.out.println("Number of heads: "+ heads);
		System.out.println("Number of tails: " +tails);
		
		double headpercentage = (double)heads/number*100;
		double tailpercentage = (double)tails/number*100;
		
		System.out.println("Percentage of heads: "+ headpercentage);
		System.out.println("Percentage of tails: "+ tailpercentage);
	}
}
