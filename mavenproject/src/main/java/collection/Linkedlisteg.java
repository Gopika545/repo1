package collection;


import java.util.LinkedList;

public class Linkedlisteg {

	public static void main(String[] args) {
		
		LinkedList<String> var =new LinkedList<String>();
		var.add("print");
		var.add("data");
		var.add("display");
		var.set(1, "hello");
		var.remove(0);
		
			System.out.println(var);
			System.out.println(var.get(1));
			System.out.println(var);
			System.out.println(var);
			if(var.contains("display")) {
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


