import java.util.Scanner;

public class _02_Generate3LetterWord {
	//Write a program to generate and print all 3-letter words consisting of given set of characters. 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		String resultString = "";
		char[] letters = str.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < letters.length; j++) {
				for (int j2 = 0; j2 < letters.length; j2++) {
					System.out.print(resultString + letters[i] + letters[j]
							+ letters[j2] + " ");
				}

			}
		}

	}

}