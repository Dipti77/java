// Enter two numbers and do the following arithmetic Operations find max and min.

package bridgelabz;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = sc.nextInt();
		System.out.println("Enter second number: ");
		b = sc.nextInt();
		System.out.println("Enter third number: ");
		c = sc.nextInt();
		
		int first, second, third, fourth;
		first = a + b * c;
		System.out.println("a+b*c= " + first);
		second = c + a / b;
		System.out.println("c+a/b= " + second);
		third = a % b + c;
		System.out.println("a%b+c= " + third);
		fourth = a * b + c;
		System.out.println("a*b+c= " + fourth);
		

		if (first>=second && first>=third && first>=fourth) {
			System.out.println("The max value is " +first);
			
		}else if(second>=first && second>=third && second>=fourth){
			System.out.println("The max value is " +second);
			
		}else if(third>=first && third>=second && third>=fourth) {
			System.out.println("The max value is " +third);
			
		}else {
			System.out.println("The max value is " +fourth);
		}
			
		
		
		if (first<=second && first<=third && first<=fourth) {
			System.out.println("The min value is " +first);
			
		}else if(second<=first && second<=third && second<=fourth){
			System.out.println("The min value is " +second);
			
		}else if(third<=first && third<=second && third<=fourth) {
			System.out.println("The min value is " +third);
			
		}else {
			System.out.println("The min value is " +fourth);
		}
	}
}
