import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _12_CardsFrequences {
	// We are given a sequence of N playing cards from a standard deck. The
	// input consists of several cards (face + suit), separated by a space.
	// Write a program to calculate and print at the console the frequency of
	// each card face in format "card_face -> frequency". The frequency is
	// calculated by the formula appearances / N and is expressed in percentages
	// with exactly 2 digits after the decimal point. The card faces with their
	// frequency should be printed in the order of the card face's first
	// appearance in the input. The same card can appear multiple times in the
	// input, but it's face should be listed only once in the output.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split("[\\W]+");
		Map<String, Integer> cards = new LinkedHashMap();
		for (String card : input) {
			Integer count = cards.get(card);
			if (count == null) {
				count = 0;
			}
			cards.put(card, count + 1);
		}
		for (String card : cards.keySet()) {
			int count = cards.get(card);
			double result = ((double) count / (double) input.length)
					* (double) 100;
			System.out.printf("%s -> %.2f%%", card, result);
			System.out.println();

		}

	}

}