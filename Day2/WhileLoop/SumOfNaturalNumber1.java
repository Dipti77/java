// Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

package bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNumber1 {

	public static void main(String[] args) {
		
		int i = 1;
		int n;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = sc.nextInt();
		
		while (i<=n)
		{
			sum = sum + i;
			i++;
		}
		
		System.out.println("Sum of " + n + " natural numbers = " + sum);
	}
	
}

