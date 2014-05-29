import java.util.Scanner;

public class _08_CountBitPairs {

	public static void main(String[] args) {
		// Write a program to count how many sequences of two equal bits ("00"
		// or "11") can be found in the binary representation
		// of given integer number n (with overlapping).

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String binary = Integer.toBinaryString(num);
		char[] bits = binary.toCharArray();
		int j = 1;
		int counter = 0;
		for (int i = 0; i < bits.length - 1; i++) {
			if (bits[i] == bits[j]) {
				counter++;
			}
			j++;
		}
		System.out.println(counter);

	}

}