import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _08_SumNumbersFromText {
	// Write a program to read a text file "Input.txt" holding a sequence of
	// integer numbers,
	// each at a separate line. Print the sum of the numbers at the console.

	public static void main(String[] args) {
		File file = new File("Input8.txt");
		int sum = 0;
		try {

			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				int i = sc.nextInt();
				sum += i;

			}
			System.out.println(sum);
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error");

		}

	}
}