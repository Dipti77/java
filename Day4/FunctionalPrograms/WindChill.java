//  Write a program WindChill.java that takes two double command-line arguments t and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the National Weather Service defines the effective temperature (the wind chill) to be:
// w=35.74+0.6215t+(0.4275t-35.75)v^0.16

package bridgelabz;

public class WindChill {

	public static void main(String[] args) {
		
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		
		double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		
		System.out.println("Temperature = " + t);
		System.out.println("Wind speed = " + v);
		System.out.println("Wind Chill = " + w);
	}
}

