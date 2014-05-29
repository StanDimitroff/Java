import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord {
	// Write a program to find the most frequent word in a text and print it, as
	// well as how many times it appears in format "word -> count". Consider any
	// non-letter character as a word separator. Ignore the character casing. If
	// several words have the same maximal frequency, print all of them in
	// alphabetical order.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] text = sc.nextLine().toLowerCase().split("\\W+");
		Map<String, Integer> words = new TreeMap<>();
		int bestCount = 0;
		for (String word : text) {
			Integer count = words.get(word);
			if (count == null) {
				count = 0;
			}
			words.put(word, count + 1);
			if (count + 1 >= bestCount) {
				bestCount = count + 1;
			}
		}
		for (String word : words.keySet()) {
			int count = words.get(word);
			if (count == bestCount) {
				System.out.println(word + " -> " + count + " times");
			}

		}
	}

}