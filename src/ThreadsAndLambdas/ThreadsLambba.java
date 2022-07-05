package ThreadsAndLambdas;

import java.util.Random;

public class ThreadsLambba 
{
	/**
	 * Create a class with 2 threads which run on finding a random number.
	 * Whichever thread finds it first, will terminate the program
	 */
	public static void main(String[] args) {
		
		Random rand = new Random();
		try
		{
			Runnable r = ()->{
				int value;
				while(true)
				{
					value = rand.nextInt(100);
					
					if (value == 44) 
					{
						System.out.println("\n\n\n====================\n\n\n");
						System.out.println(Thread.currentThread().getName().toString()+"!!!! Found the number");
						break;
					}
					else
					{
						System.out.println(Thread.currentThread().getName().toString()+" :( :( Sorry! wrong number");
					}
				}	
				try {
					throw new MyException();
				} catch (MyException e) {
					// TODO Auto-generated catch block
					e.displayMessage("Done");
				}
			};
			
			Thread t1 = new Thread(r);
			Thread t2 = new Thread(r);
			t1.setName("Thread1");
			t2.setName("Thread2");
			t1.start();
			t2.start();
		} 
		catch (Exception e) 
		{
			
		}
	}
}

class MyException extends  Exception
{
	public void displayMessage(String message)
	{
		System.out.println(message);
	}
}
