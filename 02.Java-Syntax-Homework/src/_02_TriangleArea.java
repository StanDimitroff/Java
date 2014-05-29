import java.util.Scanner;

public class _02_TriangleArea {

	public static void main(String[] args) {
		// Write a program that enters 3 points in the plane (as integer x and y
		// coordinates),
		// calculates and prints the area of the triangle composed by these 3
		// points. Round the result to a whole number.
		// In case the three points do not form a triangle, print "0" as result.

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int ax = input.nextInt();
		int ay = input.nextInt();
		int bx = input.nextInt();
		int by = input.nextInt();
		int cx = input.nextInt();
		int cy = input.nextInt();
		int area = (Math.abs(ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2);
		System.out.println(area);

	}

}