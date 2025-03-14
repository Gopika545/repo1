package aggregation;

public class Lineitem {
	int quantity;
	Product object;
	

	public Lineitem(int quantity, Product object ) {
		super();
		this.quantity = quantity;
		this.object = object;
	}

public void display()
{
	System.out.println("quantity");
	System.out.println(object.id);
	System.out.println(object.name);
	System.out.println(object.discription);
	
	
}
	public static void main(String[] args) {
		Product object1=new Product( 25,"ikshit","java class");
			
				Lineitem object2=new Lineitem(456,object1);
object2.display();
	}

}
