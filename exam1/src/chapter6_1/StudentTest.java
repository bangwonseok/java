package chapter6_1;

public class StudentTest {
	public static void main(String[]args) {
		//�л� -> ���� -> �й��� �ڵ�����(seriaNum - static)
		// �й��� �ڵ� �����ϰ� �߱� -> �߱� �� ������ �й��� ��� ����
		Student st1 = new Student(); //1
		Student st2 = new Student(); //2
		Student st3 = new Student(); //3
		
		System.out.println("s1�й�=" + st1.getSerialNum());
		System.out.println("s2�й�=" + st2.getSerialNum());
		System.out.println("s3�й�=" + st3.getSerialNum());
		
		
		System.out.println("s1�й�=" + st1.getStudentId());
		System.out.println("s2�й�=" + st2.getStudentId());
		System.out.println("s3�й�=" + st3.getStudentId());
	}
}
