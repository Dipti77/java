// Write a program to check two strings are equal or not.

package javasamples;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		
		String str1;
		String str2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string: ");
		str1 = sc.nextLine();
		
		System.out.println("Enter second string: ");
		str2 = sc.nextLine();
		
		if (str1 == str2)
			System.out.println("Strings are equal");
		else {
			System.out.println("Strings are not equal");
		}
			
	}
}


