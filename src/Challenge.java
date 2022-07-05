import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Challenge {
	public static void main(String[] args) {
		challenge(5020);
	}
	
	public static void challenge(int number) {
		System.out.println("Starting evaluation for: "+number);
		int monitornumber = number;
		int paradoxNumber = 0;
		while(true) {
			if(monitornumber == 6174)
				break;
			char[] numbCharArr = ((Integer)monitornumber).toString().toCharArray();
			List<Integer> anumbArr = new ArrayList<Integer>();
			List<Integer> ascenumbArr = new ArrayList<Integer>();
			List<Integer> descnumbArr = new ArrayList<Integer>();
			for(int i=0; i<numbCharArr.length; i++) {
				anumbArr.add(Character.getNumericValue(numbCharArr[i]));
			}			
			descnumbArr = anumbArr;
			anumbArr.sort(null);
			ascenumbArr = anumbArr;			
			StringBuilder ascNumStr = new StringBuilder();
			ascenumbArr.stream().forEach(num->{
				ascNumStr.append(num.toString());
				});
			int ascNum = Integer.parseInt(ascNumStr.toString());
			
			Collections.sort(descnumbArr, (i1, i2)-> (i1>i2)?-1:+1);
			StringBuilder descNumStr = new StringBuilder();
			descnumbArr.stream().forEach(num->{
				descNumStr.append(num.toString());
				});
			int descNum = Integer.parseInt(descNumStr.toString());

			monitornumber = descNum- ascNum;	
			System.out.println("=============================================");
			challenge(monitornumber);
		}
		System.out.println("Paradox number "+monitornumber+" reached");
		 	
	}
}
