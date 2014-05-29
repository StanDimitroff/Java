import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayofNumbers {
	// Write a program to enter a number n and n integer numbers and sort and
	// print them.
	// Keep the numbers in array of integers: int[].

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] nums = new int[n];
		input.nextLine();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}