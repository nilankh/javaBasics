package encapsulation;

public class EncapsulationInfo {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
//		l1.price = 23;
		l1.setPrice(31);

	}
	
//	public
//	public void doWork() {
//		System.out.println("Working working");
//	}
	
//	default
//	void doWork() {
//		System.out.println("Working working");
//	}
	
//	private
//	private void doWork() {
//		System.out.println("Working Working");
//	}
	
}
class Laptop{
	int ram;
	private int price;
	
	public void setPrice(int price) {
//		is the user an Admin
		boolean isAdmin = false;
		if(!isAdmin) {
			System.out.println("You can not set the price.");
		}else {
			this.price = price;
		}
		
	}
}
