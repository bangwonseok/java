package chapter9_3;

public abstract class Car {
	public abstract void drive(); // �Ϲ� �¿��� (ManualCar -> ������ ����, ���� ������ -> AI�� ����)
	public abstract void stop();
	public void startCart()	{// �õ� �ɱ�
		System.out.println("�õ� �ѱ�");
	}
	public void turnOff() { // �õ� ����
		System.out.println("�õ� ����");
	}
	
	public void run() {
		drive();
		stop();
		startCart();
		turnOff();
		
	}
}
