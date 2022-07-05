package LambdaExpression;

public class Closures 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20; 
		
		Closures closure = new Closures();
		//Annonymous inner class
		closure.doProcess(a, new Process() {		
			@Override
			public void process(int i) {
				System.out.println("Value of i is:"+a);
				System.out.println(this);
			}
		});	
		closure.executeLamba();
	} 
	
	protected void executeLamba()
	{
		// Lambda expression
		doProcess(10, p -> {
			System.out.println("value of i: " + 10);
			System.out.println(this);
		});
	}
	
	public void doProcess(int i, Process p)
	{
		p.process(i);
	}
}

@FunctionalInterface
interface Process
{
	void process(int i);
}