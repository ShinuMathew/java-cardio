package BankBazaar;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class SplitIt {

	public static String s = "XPATH|a[href='/uk/web/checkout']";
	
	
	public static void main(String[] args) {
		String[] sarr = s.split("\\|");
		
		Stream<String> s = Stream.of(sarr);
		s.forEach(System.out::println);
		
		System.out.println(Instant.now().toString());
		
		System.out.println(generateIMEI());
		
	}
	
	
	static String generateIMEI() {
        int pos;
        int[] str = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int sum = 0;
        int final_digit;
        int t;
        int len_offset;
        int len = 15;
        String imei = "";

        String[] rbi = new String[]{"01", "10", "30", "33", "35", "44", "45", "49", "50", "51", "52", "53", "54", "86", "91", "98", "99"};
        String[] arr = rbi[(int) Math.floor(Math.random() * rbi.length)].split("");
        str[0] = Integer.parseInt(arr[0]);
        str[1] = Integer.parseInt(arr[1]);
        pos = 2;

        while (pos < len - 1) {
            str[pos++] = (int) (Math.floor(Math.random() * 10) % 10);
        }

        len_offset = (len + 1) % 2;
        for (pos = 0; pos < len - 1; pos++) {
            if ((pos + len_offset) % 2 != 0) {
                t = str[pos] * 2;
                if (t > 9) {
                    t -= 9;
                }
                sum += t;
            } else {
                sum += str[pos];
            }
        }

        final_digit = (10 - (sum % 10)) % 10;
        str[len - 1] = final_digit;

        for (int d : str) {
            imei += String.valueOf(d);
        }

        return imei;
    }
}
