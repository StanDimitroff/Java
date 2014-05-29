import java.util.Scanner;

public class _05_CountAllWords {
	// Write a program to count the number of words in given sentence. Use any
	// non-letter character as word separator.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] words = input.split("[\\W]+");
		int wordCounter = words.length;
		System.out.println(wordCounter);

	}

}