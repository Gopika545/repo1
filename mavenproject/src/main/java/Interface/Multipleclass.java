package Interface;

public class Multipleclass implements Parent2,Parent3,Parent5 {
	public static void main(String[] args) {
		Multipleclass obj=new Multipleclass();
		obj.display1();
		obj.display();
		obj.display3();
		
		
	}

	@Override
	public void display1() {
		System.out.println(" print display");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println("input");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display3() {
		System.out.println("hai");
		// TODO Auto-generated method stub
		
	}

}
