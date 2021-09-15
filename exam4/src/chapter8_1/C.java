package chapter8_1;

public class C extends B{
	int numC=30;
	
	void methodC() {
		System.out.println("메서드 C");
	}
	
	C() {
		super();
		System.out.println("생성자 C");
	}
	
	@Override
	public void method() {
		System.out.println("C 클래스의 메서드");
	}
}
