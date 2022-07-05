package ThreadsAndLambdas;

public class Lambda1 
{
	public static void show(Interef i)
	{
		i.display();
	}
	
	public static void main(String[] args) 
	{
		Lambda1.show(()->System.out.println("Hello world"));
	}
}

@FunctionalInterface
interface Interef
{
	public void display();
}
