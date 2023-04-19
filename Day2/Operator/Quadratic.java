/*  Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
*   Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
*   Root 1 of x = (-b + sqrt(delta))/(2*a)
*   Root 2 of x = (-b - sqrt(delta))/(2*a)
*   Take a, b, and c as input values to find the roots of x.
*/

package bridgelabz;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		b = sc.nextInt();
		System.out.println("Enter the value of c: ");
		c = sc.nextInt();
		
		int delta = (b*b)-(4*a*c);
		double root1 = (-b + Math.sqrt(delta))/(2*a);
		double root2 = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.println("Root1 = " +root1 + " and Root2 = " +root2);
	}
}

