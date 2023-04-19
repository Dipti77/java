// Write a program SpringSeason.java that takes two int values m and d from the command line and prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.

package bridgelabz;

public class SpringSeason {

	public static void main(String[] args) {
		
		int month = Integer.parseInt(args[0]);
		int date = Integer.parseInt(args[1]);
		
		if((month==3 && date>=20) || (month>3 && month<6) || (month==6 && date<=20)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}
}

