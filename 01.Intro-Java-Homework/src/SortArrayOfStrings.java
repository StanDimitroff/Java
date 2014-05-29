import java.util.Arrays;
import java.util.Scanner;
public class SortArrayOfStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfStrings = Integer.parseInt(input.nextLine());
		String[] strings = new String[numberOfStrings];
		for(int i = 0;i<strings.length;i++){
			strings[i] = input.nextLine();
		}
		Arrays.sort(strings);
		for(int i = 0;i <strings.length;i++){
			System.out.println(strings[i]);
		}	 
	}
}