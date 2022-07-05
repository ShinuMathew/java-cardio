package Utils;

import java.util.ArrayList;


public class Sample2 
{
	public static void main(String[] args) {
		
		//Subjects s1 = new Subjects(1, "Maths", "Maths", 90.0);
		
		Subjects subs[] = new Subjects[2];
		
	}
}

class Subjects
{
	int subId;
	String subName;
	String subDesc;
	double marks;
	
	public Subjects(int subId, String subName, String subDesc, double marks)
	{
		this.subId = subId;
		this.subName = subName;
		this.subDesc = subDesc;
		this.marks = marks;
	}
}
