package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
			
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer customerLee = new Customer(10010, "�̼���");
		Customer customerShin = new Customer(10011, "�Ż��Ӵ�");
		GoldCustomer customerJang = new GoldCustomer(10012, "�����");
		GoldCustomer customerHong = new GoldCustomer(10013, "ȫ�浿");
		VIPCustomer customerKim = new VIPCustomer(10013, "������", 12345);
 
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerJang);
		customerList.add(customerHong);
		customerList.add(customerKim);
		
		System.out.println("========== ������ ��� ===========");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== ���η��� ���ʽ� ����Ʈ ��� ===");
		
		int price = 10000;
		for(Customer customer : customerList) {
			
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerName() + "����" + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.showCustomerInfo());
		}
	}
}
