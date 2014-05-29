import java.util.Random;
import java.util.Scanner;

public class _06_RandomHands {
	//Write a program to generate n random hands of 5 different cards form a standard suit of
	//52 cards.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numberOfHands = input.nextInt();
		for (int i = 0; i < numberOfHands; i++) {
			String result = generateHand();
			System.out.print(result + "");
			System.out.println();
		}

	}

	public static String generateHand() {

		String hand = "";
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		String[] suits = { "\u2663", "\u2666", "\u2665", "\u2660" };
		Random rnd = new Random();
		for (int i = 0; i < 5; i++) {
			int randFace = 0 + rnd.nextInt(faces.length);
			int randSuit = 0 + rnd.nextInt(suits.length);
			hand += faces[randFace] + suits[randSuit] + " ";

		}
		return hand;

	}

}