import java.time.*;

public class Epch {

	public static void main(String[] args) {
		long timeStampMillis = Instant.now().toEpochMilli();
		System.out.println(timeStampMillis);
	}
}
