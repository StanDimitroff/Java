import java.util.Scanner;

public class _02_SequencesofEqualStrings {
	// Write a program that enters an array of strings and finds in it all
	// sequences of equal elements. The input strings are given as a single
	// line, separated by a space.

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] words = input.split(" ");

		for (int i = 0; i < words.length - 1; i++) {
			System.out.print(words[i] + " ");
			if (!words[i].equals(words[i + 1]))
				System.out.println();
		}
		System.out.print(words[words.length - 1]);
	}

}