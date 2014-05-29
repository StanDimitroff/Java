import java.util.Scanner;

public class _07_CountSubstringOccurrences {
	// Write a program to find how many times given string appears in given text
	// as substring. The text is given at the first input line. The search
	// string is given at the second input line. The output is an integer
	// number. Please ignore the character casing.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine().toLowerCase();
		String searchStr = sc.nextLine().toLowerCase();
		int counter = 0;
		for (int i = 0; i <= text.length() - searchStr.length(); i++) {
			if (text.substring(i, i + searchStr.length()).equals(searchStr)) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}