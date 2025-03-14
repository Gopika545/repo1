package iterator;

import java.util.HashSet;

public class Setcollection {
	public static void main(String[] args) {
		HashSet<String>varname=new HashSet<String>();
		varname.add("hai");
		varname.add("welcome");
		varname.add("to java class");
		System.out.println(varname);
		System.out.println(varname.remove("hai"));
		varname.remove("hai");
		System.out.println(varname);
		if(varname.contains("welcome"));
		{
		
		System.out.println("value present");
		}
		else
	
	   {
			System.out.println("not presenting");
			
		}
		if(varname.isEmpty());
		{
			System.out.println("list is empty");
			
		}
		varname.removeAll(varname);
		{
		System.out.println(varname);
		
		}
		
		
		
		
	}

}
