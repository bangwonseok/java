package chapter8;

public class CustomerTest2 {
	public static void main(String[] args) {
		//VIPCustomer2 vip = new VIPCustomer2();
		Customer vip = new VIPCustomer2(1001, "VIP ¾Æ¾Æ", 1000);
		System.out.println(vip.calcPrice(50000));
		vip.showInfo();
	}
}
