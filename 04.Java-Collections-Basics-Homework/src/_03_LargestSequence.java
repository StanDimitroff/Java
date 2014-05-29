import java.util.Scanner;

public class _03_LargestSequence {
	// Write a program that enters an array of strings and finds in it the
	// largest sequence of equal elements. If several sequences have the same
	// longest length, print the leftmost of them. The input strings are given
	// as a single line, separated by a space.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputLine = sc.nextLine();
		String[] words = inputLine.split(" ");
		int lenght = 1;
		int bestLenght = 0;
		int bestIndex = 0;
		if (words.length == 1) {
			System.out.println(words[0]);
		}
		for (int i = 0; i < words.length - 1; i++) {
			int j = i + 1;
			while (words[i].equals(words[j])) {
				lenght++;
				j++;
				if (j > words.length - 1) {
					break;
				}
			}
			if (lenght > bestLenght) {
				bestLenght = lenght;
				bestIndex = i;

			}
			lenght = 1;
		}

		for (int i = bestIndex; i < bestIndex + bestLenght; i++) {
			System.out.print(words[i] + " ");
		}
	}

}