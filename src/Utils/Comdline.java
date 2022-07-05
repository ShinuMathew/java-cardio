package Utils;

import java.awt.color.CMMException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Comdline {

	public static void main(String[] args) throws IOException {
		
		System.out.println(System.getProperty("user.name"));
		
		Pattern p = Pattern.compile("[\\d\\.]{1,15}");
		Matcher m = p.matcher("#: 000133190863");
		
		while(m.find())
		{
			System.out.println(m.group());
		}
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("My Name is: \n Shinu");
		
		System.out.println(sb1);
	}
}
