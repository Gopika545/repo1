package polymorphisum;

public class Classb2 extends ClassA2 {
	public static void main(String[] args) {
		Classb2 obj=new Classb2();
		obj.collection(10);
		
	}
	public void collection(int a)
	{
	
	super.collection(12);
	System.out.println("the number is"+ a);
	System.out.println("child class collection");

}}
