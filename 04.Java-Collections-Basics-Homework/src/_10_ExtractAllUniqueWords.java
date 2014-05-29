import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _10_ExtractAllUniqueWords {
	// At the first line at the console you are given a piece of text. Extract
	// all words from it and print them in alphabetical order. Consider each
	// non-letter character as word separator. Take the repeating words only
	// once. Ignore the character casing. Print the result words in a single
	// line, separated by spaces.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] text = sc.nextLine().toLowerCase().split("[\\W]+");
		Set<String> words = new TreeSet<>();
		for (int i = 0; i < text.length; i++) {
			words.add(text[i]);
		}
		for (String word : words) {
			System.out.print(word + " ");
		}

	}

}