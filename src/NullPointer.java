import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class NullPointer {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		String dateString = dateFormat.format(new Date()).toString();				
		String expDate = dateString.replace(" ", "T")+"Z";
		System.out.println(expDate);
		
		String runid = "GBRSAN1561437662154";
		System.out.println(runid.substring(0, 15));
	}
}
