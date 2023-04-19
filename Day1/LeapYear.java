// Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.

package javasamples;

import java.util.Scanner;

public class LeapYear {
	
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

