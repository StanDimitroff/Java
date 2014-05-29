import java.util.Scanner;

public class _01_RectangleArea {

	public static void main(String[] args) {
		// Write a program that enters the sides of a rectangle (two integers a
		// and b) and calculates and prints the rectangle's area.

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int width = input.nextInt();
		int height = input.nextInt();
		long area = width * height;
		System.out.println(area);

	}

}