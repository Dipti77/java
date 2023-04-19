// Read a Number 1,10,100,1000 and display unit, ten, hundred

package bridgelabz;

import java.util.Scanner;

public class Number {
	
	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if (num == 1) {
			System.out.println("Unit");
		}else if (num == 10) {
			System.out.println("Ten");
		}else if (num == 100) {
			System.out.println("Hundred");
		}else if (num == 1000) {
			System.out.println("Thousand");
		}else if (num == 10000) {
			System.out.println("Ten Thousand");
		}else if (num == 100000) {
			System.out.println("Hundred Thousand");
		}else if (num == 1000000) {
			System.out.println("Million");
		}else {
			System.out.println("Invalid input");
		}
		
		}
	}
