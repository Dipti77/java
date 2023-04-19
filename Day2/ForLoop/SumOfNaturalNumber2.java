// Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

package bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNumber2 {

	public static void main(String[] args) {
		
		int i;
		int n;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = sc.nextInt();
		
		for (i=1; i<=n; i++)
		{
			sum = sum + i;
		}
		
		System.out.println("Sum of " + n + " natural numbers = " + sum);
	}
}
