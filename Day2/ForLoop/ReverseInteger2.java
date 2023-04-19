// Write a Program to reverse the integer number eg. Input n=231 reverse is 132

package bridgelabz;

import java.util.Scanner;

public class ReverseInteger2 {

	public static void main(String[] args) {
		
		int num;
		int reverse = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		for (; num!=0;)
		{
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		
		System.out.println("The reverse of the given integer is " + reverse);
	}
}
