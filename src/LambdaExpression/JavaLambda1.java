package LambdaExpression;

public class JavaLambda1 
{
	public static void main(String[] args) 
	{
		String s = "Do i still love Priya?";
		LengthGetter length = s1->s1.length();
		LengthGetter leng = s2->s2.charAt(2);
		
		System.out.println(length.getLength(s));
	}
}

@FunctionalInterface
interface LengthGetter
{
	int getLength(String s);
	
}
