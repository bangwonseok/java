package chapter7;

public class StudentTest {
	public static void main(String[]args) {
		// �ڷ���[] ������ = new �ڷ���[����]; // ���� �ڷ��� - Student
		Student[] list= new Student[3];	// �ν��Ͻ��� ������ ���� �ڷ����� ������ ����
		for(int i=0; i<list.length; i++) {
			//System.out.println(list[i]);
			int num= i+1;
			int ban= i%4;
			list[i] = new Student("�̸�" +  num, ban+1);
		}
		for(int i=0; i<list.length; i++) {
			list[i].showinfo();
		}
	}
}
