// Java Program to Find the Largest Among Three Numbers

package bridgelabz;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = sc.nextInt();
		System.out.println("Enter the second number: ");
		b = sc.nextInt();
		System.out.println("Enter the third number: ");
		c = sc.nextInt();
		
		if (a >= b && a >=c) {
			System.out.println(a + " is the largest number");
		}else if (b >= a && b >= c) {
			System.out.println(b + " is the largest number");
		}else {
			System.out.println(c + " is the largest number");
		}
		
	}
}
