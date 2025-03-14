package exception;

public class Throw {

	public static void main(String[] args) throws Exception {
		int a=16;
		if(a>=18)
		{
			System.out.println("canditate eligible for voting");
		}
		else
		{
			throw new Exception("not eligible");
		}
		

	}}
