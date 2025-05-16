
package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Example {

	public static void main(String[] args) {
		ArrayList<String> sum =new ArrayList<String>();
		sum.add("hello");
		sum.add("welcome");
		sum.add("to java");
		Iterator<String> itr= sum.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
	

		}}}


