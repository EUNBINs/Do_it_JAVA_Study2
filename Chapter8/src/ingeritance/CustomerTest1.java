package ingeritance;

public class CustomerTest1 {

	public static void main(String[] args) {
	/*		
			Customer customerLee = new Customer();
			customerLee.setCustomerID(10100);
			customerLee.setCustomerName("Lee");
	*/
			Customer customerKim = new VIPCustomer(10101, "Kim", 9502);
			
			customerKim.bonusPoint = 1000;
			
			
	//		System.out.println(customerLee.showCustomerInfo());	// customer 클래스에 public String showCustomerInfo() {라고 되어있기 때문에 프린트출력
			System.out.println(customerKim.showCustomerInfo());
			
	}

}
