import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class DateTimeDemo {

	public static void main(String[] args) {

		List<String> dates = new ArrayList<>();
		dates.add("2019-06-24T16:30:34.445");
		dates.add("2019-06-22T16:30:34.445");
		dates.add("2019-06-24T16:33:34.445");
		dates.add("2019-06-28T16:30:34.445");
		dates.add("2019-06-21T16:30:31.445");
		dates.add("2019-06-21T16:30:34.445");
		dates.add("2019-06-22T09:30:34.445");
		dates.add("2019-06-12T16:30:34.446");
		dates.add("2019-06-12T16:30:34.444");
		dates.add("2019-06-11T16:30:24.445");
		
		System.out.println(Instant.now().toEpochMilli());
		new DateTimeDemo().GetClassName();
		
/*

hmset orders:12 testrunid GBRDD174450645 orders '{"transactionstatus":"Success","carts":"CARTS_SINGLEITEM_NORMAL_SINGLEQTY3"}' created 1561467105669
hmset orders:13 testrunid GBRDD144345714 orders '{"transactionstatus":"Success","carts":"CARTS_SINGLEITEM_NORMAL_SINGLEQTY4"}' created 1561468921922
hmset orders:14 testrunid GBRDD174450815 orders '{"transactionstatus":"Success","carts":"CARTS_SINGLEITEM_NORMAL_SINGLEQTY2"}' created 1561468935620
hmset orders:16 testrunid GBRDD174340714 orders '{"transactionstatus":"Success","carts":"CARTS_SINGLEITEM_NORMAL_SINGLEQTY4"}' created 1561468946350

 */
	}
	
	public void GetClassName() {
		System.out.println(this.getClass().getSimpleName().toUpperCase());
	}
}
