// Write a Program to find Palindrome Number
// eg. Input n=121 then after reverse output is same 121 then it is a palindrome.
// eg. Input n=321 then after reverse output is not same it's 123 then it is not a palindrome number.


package bridgelabz;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int num;
		int reverse = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		int temp=num;
		
		for (; num!=0;)
		{
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		
		System.out.println("The reverse of the given integer is " + reverse);
		
		if (temp == reverse) {
			System.out.println("The number is a palindrome");
		}else {
			System.out.println("The number is not a palindrome");
		}
		
	}
}
