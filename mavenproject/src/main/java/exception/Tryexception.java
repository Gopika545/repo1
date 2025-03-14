package exception;

public class Tryexception {

	public static void main(String[] args) {
		int a=5;
		
		try
		{
		
			int b=a/0;
			System.out.println("print the number"+b);
		

	}
		catch(ArithmeticException i)
		{
			int b=a/2;
			System.out.println("print the number"+b);
			System.out.println(i);
		}

}}
