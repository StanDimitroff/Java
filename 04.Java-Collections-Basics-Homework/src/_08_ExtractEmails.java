import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_ExtractEmails {
	// Write a program to extract all email addresses from given text. The text
	// comes at the first input line. Print the emails in the output, each at a
	// separate line. Emails are considered to be in format <user>@<host>

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String emailRegex = "[\\w-+]+(?:\\.[\\w-+]+)*@([\\w-]+\\.)+[\\w]{2,5}";

		Pattern emailPattern = Pattern.compile(emailRegex);
		Matcher matcher = emailPattern.matcher(text);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}

}