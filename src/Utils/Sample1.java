package Utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.plaf.FileChooserUI;

public class Sample1 {
	
	public static Date date;
	public static File report;
	public static String src = "/Users/ecom-shinu.mathew/Documents/Insight10/Reports/"; 
	public static FileWriter fileWrite;
	public static String text = "Text.txt";
	public static String country = "ROU";
	public static String env = "QA";
	public static String tcname = "ROU_QA_Smoke01";
	

	public static void main(String[] args) throws IOException 
	{
		date = new Date();
		String date = LocalDate.now().toString();
		String time = LocalDateTime.now().toString();
				
		//Create folder with date
		src = src+date;
		report = new File(src);
						
		if(!report.exists())
		{
			report.mkdirs();
		}
		
		src = src+"/"+country;
		report = new File(src);
		
		if(!report.exists())
		{
			report.mkdirs();
		}
		
		src = src+"/"+env;
		report = new File(src);
		
		if(!report.exists())
		{
			report.mkdirs();
		}
		
		src=src+"/"+tcname+"_"+time;
		report = new File(src);
		
		if(!report.exists())
		{
			report.mkdirs();
		}
		
		src= src+"/"+tcname+".txt";
		report = new File(src);
		
		if(!report.exists())
		{
			report.createNewFile();
		}
		
		FileWriter fw = new FileWriter(report);
		BufferedWriter bw = new BufferedWriter(fw);
		
		List<String> lst = new ArrayList<String>();
		
		lst.add("This is test..");
		lst.add("Shinu");
		lst.add("What to do");
		lst.add("Log failed");
		lst.add("Log added...");
		
		for(String s : lst)
		{
			bw.write(s);
		}
		bw.flush();
		bw.close();
		
	}
	
	static void Sample() {


		
		System.out.println(System.getProperty("os.name").toLowerCase());
		
		String s = "${SKU_INSTOCK}##1##${SHOPFRONTURL}|##${RESULT_URL}";
		
		String[] s2 = s.split("##", 0);
		
		for(String s3 : s2)
		{
			System.out.println("\""+s3+"\"");
		}
		
		 String str = "geekss@for@geekss"; 
	        String[] arrOfStr = str.split("@", 0); 
	  
	        for (String a : arrOfStr) 
	            System.out.println(a); 
	}
	
	static void NotepadGenerate(String message)
	{
		
	}

	public static void generatehtmlReport() {
		
		try
		{
			String src = "/Users/ecom-shinu.mathew/Documents/Insight10/HtmlDemoReport/test.html";
			File htmlReport = new File(src);
			///String htmlString = FileUtils
			
			
//			if(!htmlReport.exists())
//			{
//				htmlReport.createNewFile();
//			}
//			
//			FileWriter htmlReportWritter = new FileWriter(htmlReport.getAbsoluteFile(), true);
//			
//			BufferedWriter bw = new BufferedWriter(htmlReportWritter);
//			
			


		}
		catch(Exception ex)
		{
			
		}
	}
//	bw.write("<html>");
//	bw.write("<head><title>TestHtml</title></head>\n");
//	bw.write("<body>");
//	bw.write("<table>");
//	bw.write("<tr>");
	
//	<table style="width:100%">
//    <tr>
//        <th>Sno</th>
//        <th>TCNAME</th>
//        <th>TCDESC</th>
//    </tr>
//</table>
}
