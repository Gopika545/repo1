package Interface;

public class FirstInterface implements Student {

	public static void main(String[] args) {
	
		FirstInterface obj=new FirstInterface();
		obj.display();
		obj.insta();
		System.out.println(a);
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println( "hai");
		// TODO Auto-generated method stub
		
	}
	public void insta() {
		System.out.println("childclass method");
	}

}
