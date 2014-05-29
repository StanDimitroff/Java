import java.util.Scanner;

public class _05_DecimalToHexadecimal {

	public static void main(String[] args) {
		// Write a program that enters a positive integer number num and
		// converts and prints it in hexadecimal form.
		// You may use some built-in method from the standard Java libraries.

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String hex = Integer.toHexString(num);
		System.out.printf("%S", hex);
		System.out.println();
		// Second way
		System.out.printf("%X", num);
	}

}