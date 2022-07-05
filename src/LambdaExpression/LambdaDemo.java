package LambdaExpression;

public class LambdaDemo 
{
	public static void main(String[] args) 
	{
		LambdaDemo lambda = new LambdaDemo();
		lambda.sayHello("Shinu");
		lambda.sayBye("Shinu");
	}
	
	public void sayHello(String name)
	{
		System.out.println("Hello "+name);
	}
	
	public void sayBye(String name)
	{
		System.out.println("Hello "+ name);
	}
}
