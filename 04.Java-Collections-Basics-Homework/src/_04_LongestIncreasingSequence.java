import java.util.Scanner;

public class _04_LongestIncreasingSequence {
	// Write a program to find all increasing sequences inside an array of
	// integers. The integers are given in a single line, separated by a space.
	// Print the sequences in the order of their appearance in the input array,
	// each at a single line. Separate the sequence elements by a space. Find
	// also the longest increasing sequence and print it at the last line. If
	// several sequences have the same longest length, print the leftmost of
	// them.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int[] nums = new int[input.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(input[i]);
		}

		printAllIncreasingSequences(nums);

		printLongestIncreasingSequence(nums);
	}

	// find the longest increasing sequence
	private static void printLongestIncreasingSequence(int[] nums) {
		int lenght = 1;
		int bestLenght = 0;
		int bestIndex = 0;

		for (int i = 0, j = i + 1; i < nums.length - 1; i++, j++) {
			if (nums[j] > nums[i]) {
				lenght++;
			} else {
				if (lenght > bestLenght) {
					bestLenght = lenght;
					bestIndex = j - bestLenght;
				}
				lenght = 1;
			}
		}
		if (lenght > bestLenght) {
			bestLenght = lenght;
			bestIndex = nums.length - bestLenght;
		}

		System.out.print("Longest: ");
		for (int i = bestIndex; i < bestIndex + bestLenght; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	// find all increasing sequences
	private static void printAllIncreasingSequences(int[] nums) {
		System.out.print(nums[0]);
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i + 1] > nums[i]) {
				System.out.print(" " + nums[i + 1]);
			} else {
				System.out.println();
				System.out.print(nums[i + 1]);

			}
		}
		System.out.println();
	}

}
