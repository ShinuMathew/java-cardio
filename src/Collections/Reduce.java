package Collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Reduce {
	
	public static void main(String[] args) {
		String testString = "SHINCHAN";
		char[] testChar = testString.toCharArray();
		List<char[]> testList = Arrays.asList(testChar);
//		String test = testList.stream().reduce("Good God....",(str1, str2)-> str1.toString()+" "+str2.toString());
//		System.out.println(test);
	}
}
