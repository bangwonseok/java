package chapter8;

public class Customer2 {
	// �ɹ� ����
		protected int customerID;	// �� ���̵�
		protected String customerName;	// �� �̸�
		protected String customerGrade;	// �� ���
		int bonusPoint;	// ���ʽ�����Ʈ
		double bonusRatio;	// ��������

		// ����Ʈ ������
		public Customer2() {
			customerGrade = "SILVER"; // �⺻���
			bonusRatio = 0.01;	// ���ʽ� ����Ʈ �⺻ ���� ����
		}
		
		//�޼���
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio; // ���ʽ� ����Ʈ ���
			return price;
		}
		
		//�޼���
		
		public String showCustomerInfo( ) {
			return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
		}
}
