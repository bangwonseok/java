package chapter8_1;

public class C extends B{
	int numC=30;
	
	void methodC() {
		System.out.println("�޼��� C");
	}
	
	C() {
		super();
		System.out.println("������ C");
	}
	
	@Override
	public void method() {
		System.out.println("C Ŭ������ �޼���");
	}
}
