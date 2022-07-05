package Collection;

import java.util.HashSet;

public class SetDemo 
{
	public static void main(String[] args) 
	{
		HashSet<String> names = new HashSet<String>();
			names.add("Shinu");
			names.add("Shibu");
			names.add("Suby");
			names.add("Sunil");
			names.add("Shebin");
			names.add("Shinu");
			names.add("Sunil");
			
		System.out.println(names);
	}
}
