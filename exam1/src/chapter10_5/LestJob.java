package chapter10_5;

public class LestJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ����");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("��� ��ȭ�� ���� �ʰų�, ���� ª�� ��⿭�� ����");
		
	}

}
