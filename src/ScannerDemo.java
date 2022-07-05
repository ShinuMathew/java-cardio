import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		int i = 4;
		double d = 6.0;
		String s = "Hackerrank ";
		
		int it;
		double dt;
		String st="";
		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.
		Scanner sc1 = new Scanner(System.in).useDelimiter("\n");
		it = sc1.nextInt();
		dt = sc1.nextDouble();
		st = sc1.next();
		
		System.out.println(i+it);
		System.out.println(d+dt);
		System.out.print(s+st);
	}
}
