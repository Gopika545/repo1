package accessspecifier;

public class Acessspecifier {
	public void pubmethod() {
		System.out.println("publicmethod");
		
	}
	private void primethod() {
		System.out.println("primethod");
	}
	 void defaultmethod() {
		 System.out.println("defaultmethod");
	 }
	 protected void promethod()
	 {
		 System.out.println("promethod");
	 }
	 

	public static void main(String[] args) {
		Acessspecifier obj=new Acessspecifier();
		obj.pubmethod();
		obj.primethod();
		obj.defaultmethod();
		obj.promethod();

		// TODO Auto-generated method stub

	}

}
