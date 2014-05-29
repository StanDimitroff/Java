import java.util.Locale;
import java.util.Scanner;

public class _05_AngleUnitConverter {
	//Write a method to convert from degrees to radians.
	//Write a method to convert from radians to degrees. 

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);
		int numberOfQueries = input.nextInt();
		double rad = 0;
		double deg = 0;
		String degrees = " deg";
		String radians = " rad";

		for (int i = 0; i < numberOfQueries; i++) {
			double num = input.nextDouble();
			String measure = input.nextLine();
			if (measure.equals(degrees)) {
				rad = convertDegInRad(num);
				System.out.printf("%.6f rad", rad);
				System.out.println();
			} else if (measure.equals(radians)) {
				deg = convertRadInDeg(num);
				System.out.printf("%.6f deg", deg);
				System.out.println();
			}

		}
	}

	private static double convertRadInDeg(double num) {
		double degrees = num * (180 / Math.PI);
		return degrees;
	}

	private static double convertDegInRad(double num) {
		double radians = num * (Math.PI / 180);
		return radians;

	}
}