package chapter8_1;

public class Ex1Test {
	public static void main(String[]args) {
		//B b = new B();
		//C c= new C();
		
		B bb = new C();	// AŬ������ �ν��Ͻ� + B Ŭ������ �ν��Ͻ� + CŬ������ �ν��Ͻ�
		A aa = new C(); // AŬ������ �ν��Ͻ� + B Ŭ������ �ν��Ͻ� + CŬ������ �ν��Ͻ�
		
		C cc = (C)aa; // ��� ĳ����
		
	}
}

