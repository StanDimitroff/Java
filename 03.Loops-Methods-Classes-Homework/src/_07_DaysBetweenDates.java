import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class _07_DaysBetweenDates {
	// Write a program to calculate the difference between two dates in number
	// of days.
	// The dates are entered at two consecutive lines in format day-month-year.
	// Days are in range [1…31]. Months are in range [1…12]. Years are in range
	// [1900…2100].

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String oldDate = in.next();
		String newDate = in.next();
		Date old = new SimpleDateFormat("d-MM-yyyy").parse(oldDate);
		Date newd = new SimpleDateFormat("d-MM-yyyy").parse(newDate);

		long diff = newd.getTime() - old.getTime();
		long diffDays = diff / (24 * 60 * 60 * 1000);
		System.out.println(diffDays);

	}

}