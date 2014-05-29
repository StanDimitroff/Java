import java.util.Scanner;

public class _07_CountOfBitsOne {

	public static void main(String[] args) {
		// Write a program to calculate the count of bits 1 in the binary
		// representation of given integer number n.

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String binary = Integer.toBinaryString(num);
		int counter = 0;
		char[] bits = binary.toCharArray();
		for (char bit : bits) {
			switch (bit) {
			case '1':
				counter++;
				break;
			}
		}
		System.out.println(counter);
	}
}