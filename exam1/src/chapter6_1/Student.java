package chapter6_1;

public class Student {
	static int serialNum;	//	�й� �ڵ� ����
	int studentId; // �ν��Ͻ� ���� ������ �й� ����
	
	public Student() {	//	�ν��Ͻ��� ������ �� ���� �й� seriaNum ����
		 serialNum++;
		studentId = ++serialNum;
	}
	
	public int getSerialNum() {
		return serialNum;
	}
	
	public int getStudentId() {
		return studentId;
	}
}
