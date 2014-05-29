import java.util.Scanner;

public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toLowerCase();
		String word = sc.nextLine().toLowerCase();
		String[] text = input.split("[\\W]+");
		int counter = 0;
		for (int i = 0; i < text.length; i++) {
			if (text[i].equals(word)) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}