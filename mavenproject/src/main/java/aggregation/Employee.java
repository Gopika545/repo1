package aggregation;

public class Employee {
	int id;
	String name;
	Address obj;

	public Employee(int id, String name, Address obj) {
		super();
		this.id = id;
		this.name = name;
		this.obj = obj;
	
	}
	public void instance() {
		System.out.println("id "+ id);
		System.out.println("name "+name);
		System.out.println("hname " +obj.hname);
		System.out.println("state "+obj.state);
		System.out.println("city "+ obj.city);
		System.out.println("pin "+obj.pin);
	}

	public static void main(String[] args) {
		Address object=new Address("devinivas","kerala","palakkad",679523);
		Employee object1=new Employee(76,"ikshit",object);
		object1.instance();
		
		// TODO Auto-generated method stub

	}

}
