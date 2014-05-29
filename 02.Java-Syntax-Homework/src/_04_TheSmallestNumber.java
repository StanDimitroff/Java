import java.util.Locale;
import java.util.Scanner;

public class _04_TheSmallestNumber {

	public static void main(String[] args) {
		// Write a program that finds the smallest of three numbers.

		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double firstNum = input.nextDouble();
		double secondNum = input.nextDouble();
		double thirdNum = input.nextDouble();
		double smaller = Math.min(firstNum, secondNum);
		smaller = Math.min(smaller, thirdNum);
		if (smaller == Math.floor(smaller)) {
			System.out.printf("%.0f", smaller);
		} else {
			System.out.println(smaller);
		}
	}
}