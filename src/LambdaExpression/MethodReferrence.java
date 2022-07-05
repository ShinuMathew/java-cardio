package LambdaExpression;

public class MethodReferrence 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(() -> greet());
		t1.start();
		
		Thread t2 = new Thread(MethodReferrence :: greet);
		t2.start();
	}
	
	private static void greet()
	{
		System.out.println("Hello world");
	}
}
