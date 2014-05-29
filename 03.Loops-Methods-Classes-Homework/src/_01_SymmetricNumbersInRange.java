import java.util.Scanner;

public class _01_SymmetricNumbersInRange {
	//Write a program to generate and print all symmetric numbers in given range [start…end].
	//A number is symmetric if its digits are symmetric toward its middle. 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		for (int i = start; i <= end; i++) {
			if (isSymmetric(i) == true) {
				System.out.print(i + " ");
			}
		}

	}

	private static boolean isSymmetric(int i) {
		boolean symmetric = false;
		if (Integer.toString(i).equals(
				new StringBuilder(Integer.toString(i)).reverse().toString())) {
			symmetric = true;
		}
		return symmetric;
	}
}