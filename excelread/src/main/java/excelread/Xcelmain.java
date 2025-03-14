package excelread;

import java.io.IOException;

public class Xcelmain {

	public static void main(String[] args) throws IOException {
		System.out.println(Xcelread.getstringdata(0, 0));
		System.out.println(Xcelread.getstringdata(0, 1));
		System.out.println(Xcelread.getstringdata(1, 0));
		System.out.println(Xcelread.getintegerdata(1, 1));
		System.out.println(Xcelread.getstringdata(2, 0));
		System.out.println(Xcelread.getintegerdata(2, 1));
		System.out.println(Xcelread.getstringdata(3, 0));
		System.out.println(Xcelread.getintegerdata(3, 1));
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

	}

}
