package chapter6_1;

public class StudentTest {
	public static void main(String[]args) {
		//학생 -> 생성 -> 학번이 자동증감(seriaNum - static)
		// 학번은 자동 증가하고 발급 -> 발급 된 시점의 학번이 계속 유지
		Student st1 = new Student(); //1
		Student st2 = new Student(); //2
		Student st3 = new Student(); //3
		
		System.out.println("s1학번=" + st1.getSerialNum());
		System.out.println("s2학번=" + st2.getSerialNum());
		System.out.println("s3학번=" + st3.getSerialNum());
		
		
		System.out.println("s1학번=" + st1.getStudentId());
		System.out.println("s2학번=" + st2.getStudentId());
		System.out.println("s3학번=" + st3.getStudentId());
	}
}
