// Write a Program to Check Vowel or Consonant

package bridgelabz;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		ch = sc.next().charAt(0);
		
		switch (ch) {
		case 'A':
			System.out.println("Given character is an vowel");
			break;
		case 'E':
			System.out.println("Given character is an vowel");
			break;
		case 'I':
			System.out.println("Given character is an vowel");
			break;
		case 'O':
			System.out.println("Given character is an vowel");
			break;
		case 'U':
			System.out.println("Given character is an vowel");
			break;
		case 'a':
			System.out.println("Given character is an vowel");
			break;
		case 'e':
			System.out.println("Given character is an vowel");
			break;
		case 'i':
			System.out.println("Given character is an vowel");
			break;
		case 'o':
			System.out.println("Given character is an vowel");
			break;
		case 'u':
			System.out.println("Given character is an vowel");
			break;
		default:
			System.out.println("Given character is a consonant");
			break;
		}
		
		
	}
}

