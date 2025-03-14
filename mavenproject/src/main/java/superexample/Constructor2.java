package superexample;

public class Constructor2 extends Constructor1 {

	public static void main(String[] args) {
		Constructor2 obj=new Constructor2();
		obj.constructor();
	
//

}
int a=5; 
Constructor2()
{
	System.out.println( "its an another constructor");
}

public void constructor() {
super.constructor();
System.out.println("method of child class");
System.out.println(super.a);
System.out.println(a);
		
		
		// TODO Auto-generated method stub

	}

}
