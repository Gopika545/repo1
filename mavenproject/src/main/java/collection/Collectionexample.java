package collection;

import java.util.ArrayList;

public class Collectionexample {

	public static void main(String[] args) {
		ArrayList<String> var =new ArrayList<String>();
		var.add("java");
		var.add("selenium");
		var.add("testing");
		var.set(1, "software");
		var.remove(0);
		
			System.out.println(var);
			System.out.println(var.get(1));
			System.out.println(var);
			System.out.println(var);
			if(var.contains("testing")) {
				System.out.println("value present");
	}
			else
			{
				System.out.println("not presenting");
			}
			if(var.isEmpty())
			{
				System.out.println("list is empty");
			}
	var.removeAll(var);
	System.out.println(var);
	if(var.isEmpty())
	{
		System.out.println("list is empty");
	}
var.removeAll(var);
System.out.println(var);
	



}



			
		
	

	}


