package Interface;

public class Child4  implements parent{
	

	public static void main(String[] args) {
		parent objref=new Child4();
		objref.print();
		//objref.data();//we cannot access the child class property by creating reference of interface//
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		System.out.println( "hello");
		// TODO Auto-generated method stub
		
	}
	public void data() {
		System.out.println("java");
	}

}
