package superexample;

public class Instancevariable2 extends Instancevariable {
	

	public static void main(String[] args) {
		Instancevariable2 obj=new Instancevariable2();
				obj.instance();
		//

	}
	int a=5;
	public void instance() {
		super.instance();
		System.out.println("method of child class");
		System.out.println(super.a);
		System.out.println(a);
	}
	

}