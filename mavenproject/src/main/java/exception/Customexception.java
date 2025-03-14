package exception;

public class Customexception {

	public static void main(String[] args) throws VoteException {
		int a=16;
		if(a>=18)
		{
			System.out.println("canditate eligible for voting");
		}
		else
		{
			throw new  VoteException("not eligible");
		}
		

	}
// TODO Auto-generated method stub

	}


