package Collection;

import java.util.TreeMap;

public class TreeMapSorting 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> treemap = new TreeMap<>((i1,i2)->(i1<i2)?+1:(i1>i2)?-1:0);
			treemap.put(9, "Shibu");
			treemap.put(3, "Suby");
			treemap.put(1, "Shinu");
			treemap.put(16, "Sunil");
			treemap.put(14, "Sam");
			treemap.put(15, "Saly");
			
		System.out.println(treemap);
		
		String s1 = "Shibu";
		String s2 = "Shinu";
		
		System.out.println(s1.compareTo(s2));
	}
}
