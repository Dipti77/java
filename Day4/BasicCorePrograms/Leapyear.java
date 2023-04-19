/* Leap Year
*  a. I/P -> Year, ensure it is a 4 digit number.
*  Logic -> Determine if it is a Leap Year.
*  O/P -> Print the year is a Leap Year or not.
*/

package javasamples;

import java.util.Scanner;

public class Leapyear {
	
	public static void main(String[] args) {
		
		int year;
		System.out.println("Enter an year : ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("The year is a leap year");
		else
			System.out.println("The year is not a leap year");
		}
}

