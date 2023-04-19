// Java Program to Swap Two Numbers

package bridgelabz;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args){
		
	    int a, b;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the value of a: ");
	    a = sc.nextInt();
	    
	    System.out.println("Enter the value of b: ");
	    b = sc.nextInt();

	    a = a + b;
	    b = a - b;
	    a = a - b;

	    System.out.println("After swaping: " + "a = " + a + " and b = " + b);
}
}


