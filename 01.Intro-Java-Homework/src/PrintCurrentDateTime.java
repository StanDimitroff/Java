import java.time.LocalDateTime;
public class PrintCurrentDateTime {

	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
	}
}
