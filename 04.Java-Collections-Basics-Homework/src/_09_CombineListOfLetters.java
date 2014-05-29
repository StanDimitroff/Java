import java.util.ArrayList;
import java.util.Scanner;

public class _09_CombineListOfLetters {
	// Write a program that reads two lists of letters l1 and l2 and combines
	// them: appends all letters c from l2 to the end of l1, but only when c
	// does not appear in l1. Print the obtained combined list. All lists are
	// given as sequence of letters separated by a single space, each at a
	// separate line. Use ArrayList<Character> of chars to keep the input and
	// output lists.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inputOne = sc.nextLine().split(" ");
		String[] inputTwo = sc.nextLine().split(" ");
		ArrayList<Character> firstList = new ArrayList<>();
		for (String letter : inputOne) {
			firstList.add(letter.charAt(0));
		}
		ArrayList<Character> secondList = new ArrayList<>();
		for (String letter : inputTwo) {
			secondList.add(letter.charAt(0));
		}
		secondList.removeAll(firstList);
		firstList.addAll(secondList);

		for (Character letter : firstList) {
			System.out.print(letter + " ");
		}
	}
}