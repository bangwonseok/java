package chapter8_1;

public class D extends C{
	int numD = 10;
	
	D() {
		//super(); // ���� Ŭ������ ������ ȣ��
		System.out.println("D������");
	}
	
	
	D(int numD) {
		super(numD);	// 1.numC -> super() ȣ�� �Ǿ�� ���� �ν��Ͻ��� ���� 
		// �Ű������� �ִٰ� �ؼ� ���� �Ű������� �ִ� ������ ȣ��X
		// �⺻ ���� ������ ȣ��
		this.numD = numD;
		//System.out.println("�Ű������� �ִ� ������ D");
	}
	
	void methodD() {
		System.out.println("�޼��� D");
	}
}
