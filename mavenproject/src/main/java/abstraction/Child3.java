package abstraction;

public class Child3 extends Abstraction1{
	public void sum() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		/*Abstraction1 objrefvar=new Child3();
		objrefvar.display();
		objrefvar.data();
		objrefvar.print();*/
		
		Child3 obj=new Child3();
		obj.display();
		obj.print();
		obj.data();
		obj.sum();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("java class");
		
		
	}

	@Override
	public void data() {
		System.out.println( "IKSHIT");
		// TODO Auto-generated method stub
		
	}

}
