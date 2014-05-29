import java.util.Locale;
import java.util.Scanner;

public class _03_PointsInsideFigure {

	public static void main(String[] args) {
		// Write a program to check whether a point is inside or outside of the
		// figure below.
		// The point is given as a pair of floating-point numbers, separated by
		// a space. Your program should print "Inside" or "Outside".

		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		if (x >= 12.5 && x <= 22.5 && y >= 6 && y <= 8.5) {
			System.out.println("Inside");
		} else if (x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5) {
			System.out.println("Inside");
		} else if (x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}
}