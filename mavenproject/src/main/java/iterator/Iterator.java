package iterator;

import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) {
		ArrayList<String>sum =new ArrayList<String>();
		sum.add("hello");
		sum.add("welcome");
		sum.add("to java");
		Iterator itr= sum.iterator();
		while(itr.hasNext());
		System.out.println("sum");
	

	}

}
